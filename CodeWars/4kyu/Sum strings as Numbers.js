const sumStrings=(a, b)=> {
  if(b.length>a.length) {
    let temp = b;
    b=a;
    a=temp;
  }
  const n = a.length;
  const diff = a.length-b.length;

  let sol=[];
  let left=0;

  for(let i=n-1; i>=0; i--) {
    let curr= +a[i] + (+b[i-diff] || 0) + left;
    if(curr>=10) {
      sol.unshift(curr%10);
      left=1;
    } else {
      sol.unshift(curr);
      left=0;
    }

  }
  let done=left>0?  left+sol.join("") : sol.join("");
  while (done[0] === '0') done = done.slice(1);
  return done
}

/*Description:

Given the string representations of two integers, return the string representation of the sum of those integers.

For example:

sumStrings('1','2') // => '3'
C# sumStrings("1","2") // => "3"

A string representation of an integer will contain no characters besides the ten numerals "0" to "9".*/
