const decode=s=> {
  let res='';
  for (let n of s) {
    res+=jump(+n)
  }
  return res;
}

const jump=n=>{
  switch(n) {
    case 1:
      return 9;
    case 2:
      return 8;
    case 3:
      return 7;
    case 4:
      return 6;
    case 5:
      return 0;
    case 6:
      return 4;
    case 7:
      return 3;
    case 8:
      return 2;
    case 9:
      return 1;
    default:
    return 5;
  }
}

//other solutions
function decode(string) {
  var result = '';
  for (var i = 0; i < string.length; i++) {
    result += string[i] == 0 || string[i] == 5 ? (string[i] == 0 ? 5 : 0) : 10 - string[i];
  }
  return result;
}


const decode = s => s.replace(/./g, c => '5987604321'[c]);

const decode=string=>string.split("").map(a=>a=="5" ? "0" : a=="0" ? "5" : 10- +a).join("");

/*Description:

Fans of The Wire will appreciate this one. For those that haven't seen the show, the Barksdale Organization has a simple method for encoding telephone numbers exchanged via pagers: "Jump to the other side of the 5 on the keypad, and swap 5's and 0's."

Here's a keypad for visualization.

┌───┬───┬───┐
│ 1 │ 2 │ 3 │
├───┼───┼───┤
│ 4 │ 5 │ 6 │
├───┼───┼───┤
│ 7 │ 8 │ 9 │
└───┼───┼───┘
    │ 0 │
    └───┘
Detective, we're hot on their trail! We have a big pile of encoded messages here to use as evidence, but it would take way too long to decode by hand. Could you write a program to do this for us?

Write a funciton called decode(). Given an encoded string, return the actual phone number in string form. Don't worry about input validation, parenthesies, or hyphens*/.
