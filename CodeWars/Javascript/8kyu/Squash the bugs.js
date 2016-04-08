findLongest=(str)=> {
  spl = str.split(" "),longest = 0

  for (var i = 0; i < spl.length; i++) {
    if (spl[i].length > longest)
      longest = spl[i].length
    }
    return longest
}

//very cool
var findLongest=s=>s.split` `.reduce((t,v)=>(v=v.length)>t?v:t,0)

/*Simple challenge - eliminate all bugs from the supplied code so that the code runs and outputs the expected value. Output should be the length of the longest word, as a number.

There will only be one 'longest' word.*/
