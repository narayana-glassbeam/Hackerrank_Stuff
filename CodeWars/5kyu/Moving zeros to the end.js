moveZeros=arr=> {
  let c = 0;
  for (var i = 0; i <arr.length; i++) {
    if(arr[i]===0) {
      c++;
      arr.splice(i,1);
      i--;
    }
  }
  return arr.concat(Array.from({length: c}, (v, k) => 0));
}


//using filter function
var moveZeros = function(arr){
  return arr.filter(ele => ele !== 0).concat(arr.filter(ele => ele === 0));
}

//Write an algorithm that takes an array and moves all of the zeros to the end, preserving the order of the other elements.
