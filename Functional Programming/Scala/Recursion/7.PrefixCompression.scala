object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
        val x = io.StdIn.readLine.toList
        val y = io.StdIn.readLine.toList
        val res = compress(x, y, List())

        println(res._1.length + " " + res._1)
        println(res._2.length + " " + res._2)
        println(res._3.length + " " + res._3)
    }

   @annotation.tailrec
   def compress(x: List[Char], y: List[Char], acc: List[Char]): (String,String,String) = {
      if(x.isEmpty || y.isEmpty) {
        (acc.reverse.mkString, x.mkString, y.mkString)
      } else {
        if(x.head == y.head) {
          compress(x.tail, y.tail, x.head :: acc)
        } else {
          (acc.reverse.mkString, x.mkString, y.mkString)
        }
      }

    }

}

/*Problem Statement

You are incharge of data transfer between two data-centres. Each set of data is represented by a pair of strings. Over a period of time you have observed a trend: most of the times both strings share some prefix. You want to utilize this observation to design a data compression algorithm which will be used to reduce amount of data to be transferred.

You are given two strings, x and y, representing the data, you need to find the longest common prefix (p) of the two strings. Then you will send substring p, x′ and y′, where x′ and y′ are the substring left after stripping p from them.

For example, if x=‘‘abcdefpr" and y=‘‘abcpqr", then p=‘‘abc",x′=‘‘defpr",y′=‘‘pqr".

Input Format
Input will contain two lines. First line will contain string x and second line string y.

Output Format
In first line, print the length of substring p, followed by prefix p. In second line, print the length of substring x′, followed by substring x′. Similary in third line, print the length of substring y′, followed by substring y′.

Constraints

x and y will contain only lowercase Latin characters ('a'-'z').
1≤length(x),length(y)≤105*/

//other solutions
def solve(x: String, y: String) = {
        val p = ((x zip y) takeWhile {
            p => p._1 == p._2
        } map {
            p => p._1
        }) mkString ""
        val _x = x drop p.length;
        val _y = y drop p.length;
        println(p.length + " " + p);
        println(_x.length + " " + _x);
        println(_y.length + " " + _y);
    }

//just a prefix
val prefix = x.zip(y).takeWhile { p => p._1 == p._2 }.unzip._1.mkString

//using 'case' solution, really helpful
object Solution {

    def main(args: Array[String]) {
     val out = actualOutput(readLine, readLine)
     println(out._1._1 + " " + out._1._2)
     println(out._2._1 + " " + out._2._2)
     println(out._3._1 + " " + out._3._2)
    }

    def getCommonIndex(first : List[Char], second: List[Char], commonIndex : Int) : Int = (first, second) match {
      case (Nil, Nil) => commonIndex
      case (first, Nil) => commonIndex
      case (Nil, second) => commonIndex
      case (head1 :: tail1, head2 :: tail2) => if (head1 == head2) getCommonIndex(tail1, tail2, commonIndex + 1)
                                              else commonIndex
  }

    def actualOutput(first : String, second : String) : ((Int, String), (Int, String), (Int, String)) = {
      val commonIndex = getCommonIndex(first.toList, second.toList, 0)
      val firstSuffix = first drop commonIndex
      val secondSuffix = second drop commonIndex
      ((commonIndex, first take commonIndex), (firstSuffix.length, firstSuffix), (secondSuffix.length, secondSuffix))
  }
}
