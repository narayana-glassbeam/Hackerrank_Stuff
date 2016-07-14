const mxdiflg=(a1, a2)=> {
  let arr1 = a1.map(x=>x.length)
  let arr2 = a2.map(x=>x.length)
  return a1.length>0 && a2.length>0 ? Math.max(Math.max(...arr1)-Math.min(...arr2), Math.max(...arr2)-Math.min(...arr1)) : -1
}
