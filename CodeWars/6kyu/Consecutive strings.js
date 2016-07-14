const longestConsec=(arr, k)=> {
  let sol=''
  if(k<=0) return sol
  for (let i=0; i<=arr.length-k; i++) {
    let temp = arr.slice(i,k+i).join("")
    if(temp.length > sol.length) sol=temp
  }
  return sol
}

/*Description:

You are given an array strarr of strings and an integer k. Your task is to return the first longest string consisting of k consecutive strings taken in the array.

Example:

longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"

n being the length of the string array, if n = 0 or k > n or k <= 0 return "".*/
