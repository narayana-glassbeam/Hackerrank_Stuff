const isBalanced=(s, caps)=> {
  let con = "";
  for (let i of s) {if(caps.indexOf(i)>-1) con+=i}
  let n = con.length;
  if(n%2!==0) return false;

  for(let i = 0; i<n/2; i++) {
    let index = caps.indexOf(con[i]);
    let last = caps.indexOf(con[n-i-1]);
    let next = caps.indexOf(con[i+1]);
    if(next-index<2) {
      i+=1;
    } else if (last-index<2) {
      continue;
    } else return false;
  }
  return true;
}
