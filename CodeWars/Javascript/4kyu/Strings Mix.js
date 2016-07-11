const mix=(s1, s2)=> {
  let map1 = stringCharToMap(s1)
  let map2 = stringCharToMap(s2)
  let untd = new Map([...map1, ...map2])
  let sol = []
  untd.forEach((key, value)=> {
    if (map1.has(value) && map2.has(value)) {
      if(map1.get(value)>map2.get(value)) sol.push("1:"+repeatCharNTimes(value,map1.get(value)))
      else if (map2.get(value)>map1.get(value)) sol.push("2:"+repeatCharNTimes(value,key))
      else sol.push("=:"+repeatCharNTimes(value,key))
    } else if (map1.has(value) && !map2.has(value)) {
      sol.push("1:"+repeatCharNTimes(value,key))
    } else {
      sol.push("2:"+repeatCharNTimes(value,key))
    }
  })
  return sortArrayOfStrings(sol)
}

const stringCharToMap=s=> {
  let map = new Map()
  let lower = getUniqueValues(removeAllNonLowerLetters(s).split('')).join('')
  for (let c of lower) {
    let temp = numberOfTimesCharAppears(s,c)
    if(temp>1) map.set(c,temp)
  }
  return map
}
const sortArrayOfStrings = arr => (
  arr.sort((a, b) => {
    if (a.length != b.length) {
      return b.length - a.length;
    }
    return (a < b) ? -1 : (a > b) ? 1 : 0;
  }).join("/")
)
const numberOfTimesCharAppears=(str, ch)=> ((str.match(new RegExp(ch, "g")) || []).length)
const removeAllNonLowerLetters=str=>(str.replace( /[^a-z]/g, '' ))
const getUniqueValues=arr=>(arr.filter((item, i, ar)=>(ar.indexOf(item) === i )))
const repeatCharNTimes=(c,n)=>(Array(n+1).join(c))

//all in one solution
function mix(s1, s2) {
  var counter = s => s.replace(/[^a-z]/g,'').split('').sort().reduce((x,y)=> (x[y] = 1 + (x[y]||0), x),{});
  s1 = counter(s1); s2 = counter(s2);
  var res = [], keys = new Set(Object.keys(s1).concat(Object.keys(s2)));
  keys.forEach(key => {
    var c1 = s1[key]||0, c2 = s2[key]||0, count = Math.max(c1, c2);
    if (count>1) {
      var from = [1, '=', 2][Math.sign(c2-c1)+1];
      var str = [...Array(count)].map(_=>key).join('');
      res.push(from+':'+str);
    }
  });
  return res.sort((x, y) => y.length - x.length || (x < y ? -1 : 1)).join('/');
}

/*Description:

Given two strings s1 and s2, we want to visualize how different the two strings are. We will only take into account the lowercase letters (a to z). First let us count the frequency of each lowercase letters in s1 and s2.

s1 = "A aaaa bb c"

s2 = "& aaa bbb c d"

s1 has 4 'a', 2 'b', 1 'c'

s2 has 3 'a', 3 'b', 1 'c', 1 'd'

So the maximum for 'a' in s1 and s2 is 4 from s1; the maximum for 'b' is 3 from s2. In the following we will not consider letters when the maximum of their occurrences is less than or equal to 1.

We can resume the differences between s1 and s2 in the following string: "1:aaaa/2:bbb" where 1 in 1:aaaa stands for string s1 and aaaa because the maximum for a is 4. In the same manner 2:bbb stands for string s2 and bbb because the maximum for b is 3.

The task is to produce a string in which each lowercase letters of s1 or s2 appears as many times as its maximum if this maximum is strictly greater than 1; these letters will be prefixed by the number of the string where they appear with their maximum value and :. If the maximum is in s1 as well as in s2 the prefix is =:.

In the result, substrings will be in decreasing order of their length and when they have the same length sorted alphabetically (more precisely sorted by codepoint); the different groups will be separated by '/'.

Hopefully other examples can make this clearer.

s1 = "my&friend&Paul has heavy hats! &"
s2 = "my friend John has many many friends &"
mix(s1, s2) --> "2:nnnnn/1:aaaa/1:hhh/2:mmm/2:yyy/2:dd/2:ff/2:ii/2:rr/=:ee/=:ss"

s1 = "mmmmm m nnnnn y&friend&Paul has heavy hats! &"
s2 = "my frie n d Joh n has ma n y ma n y frie n ds n&"
mix(s1, s2) --> "1:mmmmmm/=:nnnnnn/1:aaaa/1:hhh/2:yyy/2:dd/2:ff/2:ii/2:rr/=:ee/=:ss"

s1="Are the kids at home? aaaaa fffff"
s2="Yes they are here! aaaaa fffff"
mix(s1, s2) --> "=:aaaaaa/2:eeeee/=:fffff/1:tt/2:rr/=:hh"*/
