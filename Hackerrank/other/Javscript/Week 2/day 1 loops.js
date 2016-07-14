// complete the function
function vowelsAndConsonants(s) {
    var vowels = "aeiou"
    for (var i = 0; i <s.length; i++) {
        if (vowels.indexOf(s[i])>-1) console.log(s[i])
    }
    for (var i = 0; i <s.length; i++) {
        if (vowels.indexOf(s[i])==-1) console.log(s[i])
    }
}
