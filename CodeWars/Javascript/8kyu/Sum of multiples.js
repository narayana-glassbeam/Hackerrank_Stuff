const sumMul=(n,m)=>{
  if(m<=n) return "INVALID";
  let sum=0;
  for(let i = n;i<m;i++) {
    if(i%n==0) sum+=i;
  }
  return sum;
}

//other
for (var i = n; i < m; i+=n) {
    sum += i;
  }
return sum;

/*Description:

Your Job:

Find the sum of the multiples of n i.e. less than m

Keep in Mind:

n and m are natural number
note that the second argument m is excluded from the multiples*/
