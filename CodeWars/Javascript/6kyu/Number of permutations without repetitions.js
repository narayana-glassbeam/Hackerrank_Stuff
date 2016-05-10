const perms=e=>{
  e=e.toString();
  let l = e.length;
  let sol = fac(l,--l);
  let unique = Array.from(new Set(e.split('')));
  let divider = 1;
  for (let u of unique) {
    let curr = e.split( new RegExp(u,"i") ).length-1;
    let temp = fac(curr,--curr);
    divider*=temp;
  }
  return sol/divider;
}
const fac=(n,c)=>(c<=1 ? n : fac(n*c, --c))

/*
Write a function that takes a number or a string and gives back the number of permutations without repetitions that can generated using all its element.; more on permutations here.

For example, starting with:

1
45
115
"abc"
You could respectively generate:

1
45,54
115,151,511
"abc","acb","bac","bca","cab","cba"
So you should have, in turn:

perms(1)==1
perms(45)==2
perms(115)==3
perms("abc")==6*/
