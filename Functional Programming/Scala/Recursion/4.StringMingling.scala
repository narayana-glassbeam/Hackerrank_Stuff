
object Solution {

  def main(args: Array[String]): Unit = {
    val q = io.StdIn.readLine.toList
    val p = io.StdIn.readLine.toList
    println(solve(q, p))
  }

  def solve(q: List[Char], p: List[Char]): String = {
    @annotation.tailrec
    def rec(q: List[Char], p: List[Char], acc: List[Char]): String = q match {
      case x :: xs => rec(xs, p.tail, p.head :: x :: acc)
      case _       => acc.reverse.mkString
    }

    rec(q, p, List())
  }
}
