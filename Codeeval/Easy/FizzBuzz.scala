object Main extends App {
  val source = scala.io.Source.fromFile(args(0))
  val lines = source.getLines.filter(_.length > 0)
  for (l <- lines) {
    val Array(x,y,n) = l.split(" ").map(_.toInt)
    fizzBuzz(x,y,n)
  }
  def fizzBuzz(x: Int, y: Int, n: Int): Unit = {
      for (i <- 1 to n) {
        if(i%x==0 && i%y==0) print("FB ")
        else if(i%x==0) print("F ")
        else if (i%y==0) print("B ")
        else print(s"$i ")
      }
      println()
    }
}

/*
Players generally sit in a circle. The first player says the number “1”, and each player says next number in turn. However, any number divisible by X (for example, three) is replaced by the word fizz, and any divisible by Y (for example, five) by the word buzz. Numbers divisible by both become fizz buzz. A player who hesitates, or makes a mistake is eliminated from the game.

Write a program that prints out the final series of numbers where those divisible by X, Y and both are replaced by “F” for fizz, “B” for buzz and “FB” for fizz buzz.

INPUT SAMPLE:

Your program should accept a file as its first argument. The file contains multiple separated lines; each line contains 3 numbers that are space delimited. The first number is the first divider (X), the second number is the second divider (Y), and the third number is how far you should count (N). You may assume that the input file is formatted correctly and the numbers are valid positive integers.*/
