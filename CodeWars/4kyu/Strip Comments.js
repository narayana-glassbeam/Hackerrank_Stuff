const solution=(input, markers)=>{
  let m = markers.map(c=>'\\'+c).join("|");
  return input.split("\n").map(s=>s.match(m)? s.slice(0,s.indexOf(s.match(m))-1) : s).join("\n")
}

//other solutions
function solution(input, markers){
  return input.replace(new RegExp("\\s?[" + markers.join("") + "].*(\\n)?", "gi"), "$1");
}

/*Description:

Complete the solution so that it strips all text that follows any of a set of comment markers passed in. Any whitespace at the end of the line should also be stripped out.

Example:

Given an input string of:

apples, pears # and bananas
grapes
bananas !apples
The output expected would be:

apples, pears
grapes
bananas
The code would be called like so:

var result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
// result should == "apples, pears\ngrapes\nbananas"*/
