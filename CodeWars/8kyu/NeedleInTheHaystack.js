function findNeedle(haystack) {
  var index = 0;
  for (var i = 0; i < haystack.length; i++) {
    if (haystack[i]=="needle") {
      index = i;
      break;
    }
  }
  return "found the needle at position " + index.toString()
}
