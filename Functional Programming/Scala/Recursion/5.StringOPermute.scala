object Solution {

    def permute(s: String): String = {
        val l1 = s.zipWithIndex.filter(_._2%2 != 0).map(_._1).toList
        val l2 = s.zipWithIndex.filter(_._2%2 == 0).map(_._1).toList

       @annotation.tailrec
        def loop(l: List[Char], p: List[Char], acc: List[Char]): String = l match {
             case head :: tail => loop(tail, p.tail, p.head::head::acc)
             case _ => acc.reverse.mkString
        }
        loop(l1,l2,List())
    }

    def main(args: Array[String]) {
        var n = readInt();
        while(n > 0) {
            val str = io.StdIn.readLine
            println(permute(str))
            n = n - 1
        }

    }
}

/*Problem Statement

One very good day, Kazama gave Shinchan a string of even length, and asked him to swap the characters at even position with the next character. Indexing starts from 0.

Formally, given a string str of length L, where L is even, Shinchan has to swap the characters at position i and i+1, where i ∈ {0, 2,.., L-2}.

For example, if str = "abcdpqrs", then we have to swap the characters at position {(0, 1), (2, 3), (4, 5), (6, 7)} as L = 8. So answer will be "badcqpsr".

Input
First line will contain an integer, T, which is the number of test cases to follow. Then follows T lines, each containing the string str.

Output
For each test case, create the new string as mentioned above and print it.*/

//other solutions:
def main(args: Array[String]) {
    val totalInp = Console.readInt
    val inpStrings = (1 to totalInp) map (x => Console.readLine)
    for{
      i <- inpStrings
    } permute(i)
  }
  def permute(str: String) = {
    val strx = str.zipWithIndex.partition(x => x._2 % 2 ==0)
    (strx._2.map(x => x._1) zip (strx._1.map(x => x._1))).foreach(x => print(x._1 +""+x._2))
    println()
  }

//very interesting, using grouped (nice)
def solve(s: String): String = {
    s.grouped(2).map(_.reverse).mkString
  }
  def main(args: Array[String]) {
    val t = readLine().toInt
    for (_ <- 1 to t) {
      val s = readLine()
      val result = solve(s)
      println(result)
    }
  }

//also a great solution
 def main(args: Array[String]) {
      val lines = io.Source.stdin.getLines.drop(1).toList.foreach { line =>
          println(swap(line))
      }

  }
  def swap(str: String): String = {
    def helper(out: List[Char], input: List[Char]): List[Char] = input match {
      case even :: odd :: xs => helper(even :: odd :: out, xs)
      case _ => out.reverse
    }
    helper(List(), str.toList).mkString
  }
