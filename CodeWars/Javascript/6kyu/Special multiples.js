//inital solution
const countSpecMult=(n, mxval)=> {
    let list=listPrimes(n);
    let full = list.reduce((curr,next)=>curr*next, 1)
    return Math.floor(mxval/full);
}

const listPrimes=n=>{
  let set = new Set();
  let c = 2;
  while(n>0) {
    if(isPrime(c)) {
      set.add(c);
      n--;
    }
    c++;
  }
  return Array.from(set);
}

const isPrime=n=>{
  if(n<=1) return false;
  if(n<=3) return true;
  if (n%2==0 || n%3==0) return false;
  for(let i = 5; i*i<=n; i+=6) {
    if(n%i == 0 || n%(i+2)==0) return false;
  }
  return true;
}

//better, refractored and neater
const countSpecMult=(n, mxval)=> {
    let primes = [],num = 2;
    while(n>0) {
      if(isPrime(num)) {
        primes.push(num);
        n--;
      }
      num++;
    }
    return Math.floor(mxval/primes.reduce((curr,next)=>curr*next, 1));
}

const isPrime=n=>{
  for(let i = 2; i<=Math.sqrt(n); i++) {
     if(n%i == 0){
      return false;
    }
  }
  return true;
}

/*Description:

Some numbers have the property to be divisible by 2 and 3. Other smaller subset of numbers have the property to be divisible by 2, 3 and 5. Another subset with less abundant numbers may be divisible by 2, 3, 5 and 7. These numbers have something in common: their prime factors are contiguous primes.

Create a function count_specMult() that finds the amount of numbers that have the first n primes as factors below a given value, maxVal

Let's see some cases:

count_specMult(3, 200) -------> 6

/// the first 3 primes are 2, 3 and 5

and the found numbers below 200 are 30 < 60 < 90 < 120 < 150 < 180 < 200 (6 numbers)
Happy coding!!*/
