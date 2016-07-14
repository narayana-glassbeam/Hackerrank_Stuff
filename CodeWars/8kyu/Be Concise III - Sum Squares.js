sumSquares=array=> {
  return array.map(x=>x*x).reduce((a,b)=>a+b)
}

//other solutions
function sumSquares(array) {
  return array.reduce((a,b) => a + b ** 2, 0);
}

/*
Description:

Be Concise III - Sum Squares

You are given a program sumSquares that takes an array as input and returns the square of the sums of each item in an array. For example:

sumSquares([1,2,3,4,5]) === 55 // 1 ** 2 + 2 ** 2 + 3 ** 2 + 4 ** 2 + 5 ** 2
sumSquares([7,3,9,6,5]) === 200
sumSquares([11,13,15,18,2]) === 843

Shorten the code such that it meets the requirements.
*/

