const add=(a, b)=> {
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
  return left>0?  left+sol.join("") : sol.join("")
}

//other solution
function add(a, b) {
  var carry = 0, result = [],
      len = Math.max(a.length, b.length), i = len;
  while (i--) {
    var sum = (+a[i - len + a.length]||0) + (+b[i - len + b.length]||0) + carry;
    carry = parseInt(sum / 10);
    result.unshift(sum % 10);
  }
  if (carry) result.unshift(carry);
  return result.join('');
}

/*Description:

We need to sum big numbers and we require your help.

Write a function that returns the sum of two numbers. The input numbers are strings and the function must return a string.

Example

add("123", "321"); -> "444"
add("11", "99"); -> "110"
Notes

The input numbers are big.
The input is a string of only digits
The numbers are positives*/
