const positiveSum=arr=>(arr.filter(n=>n>0).reduce((a,b)=>a+b,0))

//even better
function positiveSum(arr) {
   return arr.reduce((a,b)=> a + (b > 0 ? b : 0),0);
}


/*Description:

You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20*/
