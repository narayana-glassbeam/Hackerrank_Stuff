describeAge=a=>{
  m="You're a(n) "
  s= a>64 ? "elderly"
  : a>17 ? "adult"
  : a>12 ? "teenager"
  : "kid"
  return m+s
}

//better ones [shorter ones]
const describeAge=n=>
   "You're a(n) " +
   ( n < 13 ? 'kid': n < 18 ? 'teenager': n < 65 ? 'adult' : 'elderly')



var describeAge=a=>`You're a(n) ${a<13?"kid":a<18?"teenager":a<65?"adult":"elderly"}`


/*Description:

Be Concise I - The Ternary Operator

You are given a function describeAge that takes a parameter age (which will always be a positive integer) and does the following:

If the age is 12 or lower, it return "You're a(n) kid"
If the age is anything between 13 and 17 (inclusive), it return "You're a(n) teenager"
If the age is anything between 18 and 64 (inclusive), it return "You're a(n) adult"
If the age is 65 or above, it return "You're a(n) elderly"
Your task is to shorten the code as much as possible. Note that submitting the given code will not work because there is a character limit of 137.*/
