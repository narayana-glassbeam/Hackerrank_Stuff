//this is the recursive solution
object Solution {

  def main(args: Array[String]): Unit = {
    val q = io.StdIn.readLine.toList
    val p = io.StdIn.readLine.toList
    println(solve(q, p))
  }

  def solve(q: List[Char], p: List[Char]): String = {
    @annotation.tailrec
    def rec(q: List[Char], p: List[Char], acc: List[Char]): String = q match {
      case head :: tails => rec(tails, p.tail, p.head :: head :: acc)
      case _       => acc.reverse.mkString
    }

    rec(q, p, List())
  }
}

/*Problem Statement

Pawel and Shaka recently became friends. On their planet, it is believed that their friendship will last forever, if they merge their favorite strings and etch it on the surface of a stone.

So we will mingle their favorite strings. The lengths of their favorite strings is same (say n). Mingling two strings, P=p1p2…pn and Q=q1q2…qn, both of length n, will result in creation of a new string R of length 2×n. It will have the following structure:

R=p1q1p2q2…pnqn
You are given two strings P (favorite of Pawel) and Q (favorite of Shaka), find the mingled string R.

Input
First line of input contains string P, and second line contains Q.

Output
Print string R.*/

//Other useful solutions:
//1: using for loop and print
 def main(args:Array[String]):Unit=
    {
        var A=Console.readLine()
        var B=Console.readLine()
        for(i<- 0 until A.length())
        {
            print(A(i))
            print(B(i))
        }
    }

//2: using zip and map (excellent)
object Solution {

    def main(args: Array[String]) {
        var P=Console.readLine()
        var Q=Console.readLine()
        val R = P.zip(Q).map(e => e._1 + "" +e._2).mkString("")
        println(R)

    }
}
//or the shorter version: println(readLine.zip(readLine).map(e => e._1 + "" + e._2).mkString(""))

//3: for loop and string builder
def main(args: Array[String]) {
    var p = scala.io.StdIn.readLine
    var q = scala.io.StdIn.readLine
    var out = new StringBuilder("")
    for (i <- 0 to p.length-1) {
      out += p.charAt(i)
      out += q.charAt(i)
    }
    println(out)
  }

//4: using zip and flatMap
//flatMap vs Map (flat map flattens the sequence)
def mingle(ps: String, qs: String): String = {
    (ps, qs).zipped.flatMap{case x => Array(x._1, x._2)}.mkString("")
  }
def main(args: Array[String]) {
    val ps = io.StdIn.readLine
    val qs = io.StdIn.readLine
    print(mingle(ps, qs))
  }

//5: recursive and cool way
def main(args: Array[String]) {
        val s1 = readLine.toList
        val s2 = readLine.toList
        val result = mingle(s1, s2, Nil).reverse.mkString
        println(result)
    }
def mingle(first: List[Char], second: List[Char], accu: List[Char]): List[Char] = first match {
      case Nil => accu
      case h :: t => mingle(second, t, h :: accu)
    }

//6: zipWithIndex and yield
 def main(args: Array[String]) {
    val st1 = readLine()
    val st2 = readLine()
    val res = for(c <- st1.zipWithIndex)yield c._1.toString + st2(c._2).toString
    println(res.mkString)
  }
