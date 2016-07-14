const chessBoard=(r, c)=> {
  let x = Array.from({length: c}, (v,k)=> k%2===0? 'X' : 'O');
  let o = Array.from({length: c}, (v,k)=> k%2===0? 'O' : 'X');
  return Array.from({length: r}, (v,k)=> k%2===0? o:x);
}

//other solutions
const chessBoard = (rows, columns) =>
  Array.from(Array(rows), (_,i) => Array.from(Array(columns), (_,j) => 'OX'[(i+j)%2]))


/*  Description:

  A grid is a perfect starting point for many games (Chess, battleships, Candy Crush!).

  Making a digital chessboard I think is an interesting way of visualising how loops can work together.

  Your task is to write a function that takes two integers rows and columns and returns a chessboard pattern as a two dimensional array.

  So chessBoard(6,4) should return an array like this:

  [
      ["O","X","O","X"],
      ["X","O","X","O"],
      ["O","X","O","X"],
      ["X","O","X","O"],
      ["O","X","O","X"],
      ["X","O","X","O"]
  ]*/
