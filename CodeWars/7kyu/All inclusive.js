containAllRots=(str, arr)=> {
    for(let i =0; i<str.length;i++) {
      temp=str.slice(i,str.length)+str.slice(0,i)
      if (arr.indexOf(temp)<0) return false
  }
  return true
}


/*Description:

Input:

a string strng
an array of strings arr
Output of function contain_all_rots(strng, arr) (or containAllRots or contain-all-rots):

a boolean true if all rotations of strng are included in arr
false otherwise*/
