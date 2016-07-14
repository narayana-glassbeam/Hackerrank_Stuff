const chain=(input, fs)=>( !fs.length? input : chain(fs[0](input),fs.slice(1)))

//other solution
function chain(v, fns) {
  return fns.reduce(function(v, fn) { return fn(v) }, v);
}

/*Description:

Write a generic function chainer

Write a generic function chainer that takes a starting value, and an array of functions to execute on it (array of symbols for ruby).

The input for each function is the output of the previous function (except the first function, which takes the starting value as it's input). Return the final value after execution is complete.

function add(num) {
  return num + 1
}

function mult(num) {
  return num * 30
}

chain(2, [add, mult]);
// returns 90;*/
