let productFib=prod=>{
  const getFibs=(f,s)=>(f*s>=prod ? [f,s,f*s==prod] : getFibs(s,f+s))
  return getFibs(0,1)
}


/*The Fibonacci numbers are the numbers in the following integer sequence (Fn):

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
such as

F(n) = F(n-1) + F(n-2) with F(0) = 0 and F(1) = 1.
Given a number, say prod (for product), we search two Fibonacci numbers F(n) and F(n+1) verifying

F(n) * F(n+1) = prod.
Your function productFib takes an integer (prod) and returns an array:

[F(n), F(n+1), true]
if F(n) * F(n+1) = prod or returns

[F(m), F(m+1), false]
if you don't find two consecutive F(m) verifying F(m) * F(m+1) = prod. F(m) will be the smallest one such as F(m) * F(m+1) > prod.*/
