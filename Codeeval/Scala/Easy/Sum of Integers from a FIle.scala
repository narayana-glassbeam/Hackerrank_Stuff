object Main extends App {
  val source = scala.io.Source.fromFile(args(0))
  val lines = source.getLines.filter(_.length > 0)
  var full = 0
  for (l <- lines) {
    full+= l.toInt
  }
  println(full)
}

//Print out the sum of integers read from a file.
