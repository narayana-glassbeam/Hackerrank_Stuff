const isOpposite=(s1,s2)=>{
  if(s1 && s1.length===s2.length) {
    for(let i=0; i<s1.length; i++) {
      if(s1[i]!==s2[i] && s1[i].toLowerCase()===s2[i].toLowerCase()) continue;
      else return false;
    }
    return true;
  }
  return false;
}


/*Description:

They say that only the name is long enough to attract attention. They also said that only a simple Kata will have someone to solve it series #1:
Are they opposite?

Task

Give you two strings: s1 and s2. If they are opposite, return true; otherwise, return false.
The opposite means: All letters of the two strings are the same, but the case is opposite.

Some examples:

isOpposite("ab","AB") should return true;
isOpposite("aB","Ab") should return true;
isOpposite("aBcd","AbCD") should return true;
isOpposite("AB","Ab") should return false;
isOpposite("","") should return false;*/
