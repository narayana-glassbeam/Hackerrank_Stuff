const format=(text, width)=> {
  let arr = text.split(" ");
  let line='';
  let result='';
  for (let i=0; i<arr.length; i++) {
    if(line.trim().length<width) {
      let curr = line+`${arr[i]} `;
      if(curr.trim().length==width) {
        result+=curr.trim()+'\n';
        line='';
      } else if(curr.trim().length>width) {
        result+=line.trim()+'\n';
        line='';
        i--;
      } else line+=`${arr[i]} `;
    }
  }
  return line? (result+line).trim() : result.trim();
}

//much better solutions XD
function format(text, width) {
  var words = text.split(' '), output = [], line;
  while (words.length) {
    line = words.shift();
    while (words.length && line.length + words[0].length < width) {
      line += ' ' + words.shift();
    }
    output.push(line);
  }
  return output.join('\n');
}
//regex
function format(text, width) {
  var re = new RegExp("(?=\\S).{1," + +width + "}(?=\\s|$)", "g");
  return text.match(re).join("\n");
}

/*Description:

Write a function format that takes two arguments, text and width, and formats the text to fit the width.

Your function should divide the given text into lines using newline characters. It should fit as many words into each line as possible without exceeding the given width or splitting any words between two lines. There should not be a space at the beginning or end of any line. For example, here is some text formatted with a width of 50:

Lorem ipsum dolor sit amet, consectetur adipiscing
elit. Aliquam nec consectetur risus. Cras vel urna
a tellus dapibus consequat. Duis bibendum
tincidunt viverra. Phasellus dictum efficitur sem
quis porttitor. Mauris luctus auctor diam id
ultrices. Praesent laoreet in enim ut placerat.
Praesent a facilisis turpis.
And the same text formatted with a width of 30:

Lorem ipsum dolor sit amet,
consectetur adipiscing elit.
Aliquam nec consectetur risus.
Cras vel urna a tellus dapibus
consequat. Duis bibendum
tincidunt viverra. Phasellus
dictum efficitur sem quis
porttitor. Mauris luctus
auctor diam id ultrices.
Praesent laoreet in enim ut
placerat. Praesent a facilisis
turpis.
For the purpose of this exercise, words can contain any non-whitespace character and all words are separated by a single space. Words will never be longer than the provided width.*/
