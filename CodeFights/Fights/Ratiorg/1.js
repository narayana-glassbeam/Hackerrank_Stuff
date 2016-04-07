//ROUND 1:
function add(param1, param2) {
  return param1 + param2;
}
/*A function that adds two numbers.

Example

For param1 = 1 and param2 = 2, the output should be
add(param1, param2) = 3.

[input] integer param1
[input] integer param2
[output] integer

The sum of the two inputs.*/


//ROUND 2
function arrayMinimum(inputArray) {

  var indexOfMinimum = 0;
  for (var i = 1; i < inputArray.length; i++) {
    if (inputArray[i] < inputArray[indexOfMinimum]) {
      indexOfMinimum = i;
    }
  }
  return  inputArray[indexOfMinimum] ;
}

/*Given an array of integers, find its minimal element.

Example

For inputArray = [19, 32, 11, 23], the output should be
arrayMinimum(inputArray) = 11.

[input] array.integer inputArray
[output] integer

The minimal element of inputArray*/



//ROUND 3
function digitSum(n) {
    var arr = n.toString().split("")
    var result = 0
    for(var n in arr) {
        result+= +n;
    }
        return result

}

/*
Given an integer, find the sum of all its digits.

Example

For n = 111, the output should be
digitSum(n) = 3.

1 + 1 + 1 = 3.

[input] integer n

Non-negative integer.

[output] integer
*/
