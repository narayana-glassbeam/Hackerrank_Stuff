object Solution {
    def main(args: Array[String]) {
        val Array(n,k) = readLine.split(" ").map(_.toInt)
        val arr = readLine.split(" ").map(_.toInt)
        val bigger = arr.filter(_>k)
        val set = collection.immutable.HashSet() ++ arr
        var count = 0
        for (e <- bigger) {
            if(set.contains(e-k)) count+=1
        }
        println(count)
    }
}
//could have just convert it like this
val set = readLine.split(" ").map(_.toInt).toSet

//other solutions
import scala.util.control.Breaks._
object Solution {
  def main(args: Array[String]) {
    val k = readLine.split(' ')(1).toInt
    val l = readLine.split(' ').map(_.toInt).sortWith(_ < _)
    var sum = 0
    for (i <- 0 until l.size)
      breakable {
    for (j <- (i + 1) until l.size) {
      val r = math.abs(l(i) - l(j))
      if (r == k)
        sum += 1
      else if (r > k)
        break
    }
      }
    println(sum)
  }
}

//fastest
import scala.io.Source._
import scala.collection._
object Solution {
  def main(args: Array[String]) {
    val input = stdin.mkString.split("\n")
    val Array(n, k) = input(0).split(" ").map(_.toInt)
    var numbers = immutable.Set.empty[Int]
    input(1).split(" ").map { s:String => numbers += s.toInt }
    var k_diffs = 0
    numbers.foreach { i:Int => if (numbers(i+k)) { k_diffs += 1 } }
    println(k_diffs)
  }
}

object Solution {
    def main(args: Array[String]) {
        val lines = io.Source.stdin.getLines.toList.map(_.split(" ")).flatten.map(_.toInt)
        val n = lines.head
        val k = lines.tail.head
        val values = lines.tail.tail.toSet
        val ans = values.count(x => values.contains(x - k))
        println(ans)
    }
}

/*Given NN integers, count the number of pairs of integers whose difference is KK.

Input Format

The first line contains NN and KK.
The second line contains NN numbers of the set. All the NN numbers are unique.

Output Format

An integer that tells the number of pairs of integers whose difference is KK.

Constraints:
N≤10N≤1055
0<K<100<K<1099
Each integer will be greater than 00 and at least KK smaller than 223131−1−1.*/
