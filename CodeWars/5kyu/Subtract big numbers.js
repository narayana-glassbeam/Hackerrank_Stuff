function subtract(a, b) {
  let res = `${a-b}`;
  if(a.length<17) return res;
  else {
   if(a.length===b.length) {
     if(a===b) return 0;
     for(let i=0; i<a.length; i++) {
       if(a[i]>b[i]) {
         let result = solve(a,b);
         while (result[0] === '0') result = result.slice(1);
         return result;
       }
       else if(a[i]<b[i]) {
         let result = solve(b,a);
         while (result[0] === '0') result = result.slice(1);
         return '-'+result;
       }
     }
   }
   else if(a.length>b.length) return solve(a,b);
   else return '-'+solve(b,a);
  }
}

function solve(a,b) {
  let arr = [];
  let addTen = false;
  let diff = a.length - b.length;
  let num = a.substring(0, diff);

  for (let i=a.length-1; i>=diff; i--) {
    let aI = +a[i];
    let bI = +b[i-diff];
    if(addTen) {
      {aI-=1}
      addTen=false;
    }
    if(aI<bI) addTen=true;

    if(addTen) arr.push((10+aI)-bI);
    else arr.push(aI-bI);
  }
  return num+arr.reverse().join("");;
}

/*Description:

Subtract big numbers passed as strings

Arguments are passed as strings
Result should be returned as string
3 - 2 should return 1 while 2 - 3 should return -1
Zeros should not preceed a number! 02, -02, 0001 are invalid
Very large numbers will be tested
Note: 100 randomly generated tests*/
