function search(haystack, needle) {
  let arr = [];
  let name = "";
  let loop=(obj)=>{
    for (let i in obj) {
      if(typeof obj[i] == 'string') {
        let curr = obj[i];
        if(curr.indexOf(needle)>-1)
          arr.push(name+i);
      }
    }
    for (let i in obj) {
       if (typeof obj[i]==="object" && obj[i]!==null) {
       name+=i+".";
       loop(obj[i]);
     }
    }
  }
  loop(haystack);
  return arr.sort();
}

/*Description:

Find the needle(s) in a haystack by creating a function that returns all properties (recursively) which contains the needle (string).

Return value should be a sorted array.
*/
