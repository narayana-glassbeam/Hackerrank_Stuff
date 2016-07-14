//currently not passing extreme cases

const SumOfDigits=(a, b)=> {
    b=b%2!=0 ? b : b-1
    return getSum(a,b,0).toString()
}

const getSum=(a,b,sum)=>(b<a ? sum : getSum(a,b-2,sum+compute(b)))

//const compute=b=>b.toString().split("").map(a=>+a).reduce((a,b)=>a+b)
const compute=(n)=> {
    if (n<10) return n
    var sum = 0
     while(n>0)
     {
       sum=sum+n%10;
       n=Math.floor(n/10);
      }
    return sum
}

