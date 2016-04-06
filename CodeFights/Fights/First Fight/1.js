//COMMENT: I actually started this (first) code fight by accident, after half an hour I noticed that I was "fighting" and that's why I needed more time, and also to get familiar how everything goes, nontheless I won (luckily)

//SOLVED:
function angleType(measure) {

  if (measure < 90) {
    return "acute";
  }

  if (measure === 90) {
    return "right";
  }

  if (measure < 180) {
    return "obtuse";
  }

  return "straight";
}

/*Given the angle measure, find its type.

Example

For measure = 125, the output should be
angleType(measure) = "obtuse".
For measure = 72, the output should be
angleType(measure) = "acute".
[input] integer measure

The angle measure (in degrees), an integer not larger than 180.

[output] string

The type of the angle (i.e. "acute", "right", "obtuse" or "straight").*/
