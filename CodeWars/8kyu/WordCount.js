const countWords=s=>(s.replace(/\s/g, " ").split(" ").filter(x=>x!="").length)

//some better solution
function countWords(str) {
  return (str.match(/[^\s]+/g) || []).length;
}

const countWords = str => str.split(/\s+/).filter(x => x).length

/*Description:

Can you realize a function that returns word count from a given string?

You have to ensure that spaces in string is a whitespace for real.

What we want and finish of work:

What kind of tests we got for your code:

Function have to count words, but not spaces, so be sure that it does right.
Empty string has no words.
String with spaces around should be trimmed.
Non-whitespace (ex. breakspace, unicode chars) should be assumed as delimiter
Be sure that words with chars like -, ', ` are counted right.*/
