const oddity=(n)=>{
  let count=0;
  for (let i=1; i<=Math.sqrt(n); i++) {
    if(n%i==0) {
      count++;
      if(i!=n/i)count++;
    }
  }
  return count%2==0 ? 'even' : 'odd';
}

//other solutions
function oddity(n){
  return Math.sqrt(n)%1 ? "even" : "odd";
}


/*Description:

Given an integer n return 'odd' if the number of its divisors is odd. Otherwise return 'even'.

Examples:

All prime numbers have exactly two divisors (hence 'even')

For n=12 the divisors are [1,2,3,4,6,12] – 'even'

For n=4 the divisors are [1,2,4] – 'odd'*/
