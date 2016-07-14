String.prototype.toAlternatingCase = function () {
  var newString =""
  for (let i =0; i<this.length; i++) {
    if (this[i]==this[i].toLowerCase()) {
        newString+=this[i].toUpperCase()
    } else newString+=this[i].toLowerCase()
  }
  return newString
}

//more compact and better
const isLowerCase = (char) => char.toLowerCase() === char;
const swapCase = (char) => isLowerCase(char) ? char.toUpperCase() : char.toLowerCase();
String.prototype.toAlternatingCase = function() {
  return [...this].map(swapCase).join('');
};


String.prototype.toAlternatingCase = function () {
    return this.split("").map(a => a === a.toUpperCase()? a.toLowerCase(): a.toUpperCase()).join('')
}


String.prototype.toAlternatingCase = function(){
  return this.split("").map(letter => {
    var newLetter = letter.toUpperCase();
    return letter == newLetter ? letter.toLowerCase() : newLetter;
  }).join("");
}



/*Description:

altERnaTIng cAsE <=> ALTerNAtiNG CaSe

Define String.prototype.toAlternatingCase (StringUtils.toAlternatingCase(String) in Java) such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase. For example:

Note to no Java langs

You must NOT alter the original string.*/
