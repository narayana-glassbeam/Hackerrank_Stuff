//SOLVED:
function fractal(n) {
  var size = (1 << n) - 1;

  result = Array(size);
  resultTmp = Array(size);
  for (var i = 0; i < size; i++) {
    result[i] = Array(size);
    resultTmp[i] = Array(size);
    for (var j = 0; j < size; j++) {
      result[i][j] = 0;
      resultTmp[i][j] = 0;
    }
  }

  var draw = function(n, row, column, angle) {
    var size = (1 << n) - 1;
    if (angle !== 0) {
      draw(n, row, column, 0);
      while (angle > 0) {
        angle--;
        for (var i = 0; i < size; i++) {
          for (var j = 0; j < size; j++) {
            var x = result[row + i][column + j];
            var i0 = j;
            var j0 = size - i - 1;
            resultTmp[row + i0][column + j0] = (x >> 1) | ((x & 1) << 3);
          }
        }
        for (var i = row; i < row + size; i++) {
          for (var j = column; j < column + size; j++) {
            result[i][j] = resultTmp[i][j];
          }
        }
      }
      return;
    }
    if (n === 1) {
      result[row][column] = (1 << 3) - 1;
      return;
    }
    var add = Math.floor(size / 2) + 1;
    draw(n - 1, row, column, 0);
    if (n % 2 === 1) {
      draw(n - 1, row + add, column, 2);
      draw(n - 1, row, column + add, 3);
      draw(n - 1, row + add, column + add, 3);
      result[row][column + add - 1] |= (1 << 2);
      result[row + add - 1][column + add] |= (1 << 3);
      result[row + size - 1][column + add - 1] |= (1 << 0);
    } else {
      draw(n - 1, row + add, column, 1);
      draw(n - 1, row, column + add, 2);
      draw(n - 1, row + add, column + add, 1);
      result[row + add - 1][column] |= (1 << 3);
      result[row + add][column + add - 1] |= (1 << 2);
      result[row + add - 1][column + size - 1] |= (1 << 1);
    }
  }

  draw(n, 0, 0, 0);
  var answer = Array(size + 1);
  for (var i = 0; i < answer.length; i++) {
    answer[i] = Array((size + 1) * 2 - 1);
    for (var j = 0; j < answer[i].length; j++) {
      answer[i][j] = 0;
    }
  }
  for (var i = 0; i < size; i++) {
    for (var j = 0; j < size; j++) {
      var cell = result[i][j];
      if ((cell >> 2) % 2 === 1) {
        answer[i][j * 2 + 1] = '_';
      }
      if ((cell >> 0) % 2 === 1) {
        answer[i + 1][j * 2 + 1] = '_';
      }
      if ((cell >> 3) % 2 === 1) {
        answer[i + 1][j * 2] = '|';
      }
      if ((cell >> 1) % 2 === 1) {
        answer[i + 1][j * 2 + 2] = '|';
      }
    }
  }

  for (var i = 0; i < size + 1; i++) {
    for (var j = 0; j < (size + 1) * 2 - 1; j++) {
      if (answer[i][j] === 0) {
        answer[i][j] = ' ' ;
      }
      if (answer[i][j] === ' ' && j > 0 &&
          answer[i][j - 1] === '_' && j + 1 < answer[i].length &&
          answer[i][j + 1] === '_') {
        answer[i][j] = '_';
      }
    }
  }
  return answer;
}

/*Your task is to draw a special fractal after n iterations. The fractal consists of unit connectors '|' and '_'.

For n = 1 the fractal looks as follows:

_
_|
Now assume that you have already made N iterations and drawn the f(N) fractal. To draw the f(N + 1) fractal do the following:
Note that every fractal has exactly two edge points which can be connected to the edge points of other fractals using the unit connectors.
At first, take the f(N) fractal and place it in the top left corner. As the next step, put f(N) rotated by 0°, 90°, 180° or 270° in the remaining 3 quarters - top right, bottom left and bottom right - so that it is possible to connect all four of them by adding exactly 3 unit connectors between the adjacent fractal edge points.
Note that there is always exactly one possible combination of rotations which allows to connect all 4 f(N) fractals together.

See examples below for better understanding.

Example

For n = 1, the output should be

[[' ', '_', ' '],
 [' ', '_', '|']]

In other words, it should represent      _
the following picture:                   _|
For n = 2, the output should be

[[' ', '_', ' ', ' ', ' ', '_', ' '],
 [' ', '_', '|', ' ', '|', '_', ' '],
 ['|', ' ', ' ', '_', ' ', ' ', '|'],
 ['|', '_', '|', ' ', '|', '_', '|']]

Or, to put it differently:  _   _
                            _| |_
                           |  _  |
                           |_| |_|
For n = 3, the fractal looks as follows:

                      _   ___   ___
                      _| |_  |_|  _|
                     |  _  |  _  |_
                     |_| |_| | |___|
                      _   _  |  ___
                     | |_| | |_|  _|
                     |_   _|  _  |_
                      _| |___| |___|
For n = 4, the fractal looks as follows:

               _   ___   ___   ___   ___   _
               _| |_  |_|  _| |_  |_|  _| |_
              |  _  |  _  |_   _|  _  |  _  |
              |_| |_| | |___| |___| | |_| |_|
               _   _  |  ___   ___  |  _   _
              | |_| | |_|  _| |_  |_| | |_| |
              |_   _|  _  |_   _|  _  |_   _|
               _| |___| |___| |___| |___| |_
              |  ___   ___   _   ___   ___  |
              |_|  _| |_  |_| |_|  _| |_  |_|
               _  |_   _|  _   _  |_   _|  _
              | |___| |___| | | |___| |___| |
              |_   _____   _| |_   _____   _|
               _| |_   _| |_   _| |_   _| |_
              |  _  | |  _  | |  _  | |  _  |
              |_| |_| |_| |_| |_| |_| |_| |_|
[input] integer n

A positive integer.

[output] array.array.char

Each character can be an underscore ('_'), a vertical bar ('|') or a whitespace character (' ').*/
