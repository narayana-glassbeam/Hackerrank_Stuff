object Solution {

    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            val n = readInt
            val a = readInt
            val b = readInt

            val stoneA = math.min(a,b)
            val stoneB = math.max(a,b)
            var firstNum = stoneA * (n-1)
            val lastNum = stoneB * (n-1)

            if (stoneA==stoneB) println(firstNum)
            else {
                  (firstNum to lastNum by stoneB-stoneA).foreach(i => print(s"$i "))
                  println
            }
        }
    }
}

//not as fast as mine, but still interesting use of map ++
object Solution extends App {
  for (i <- 1 to readInt) {
    val n = readInt
    val a = readInt
    val b = readInt
    var s = Set(0)
    for (i <- 1 until n)
      s = s.map(_ + a) ++ s.map(_ + b)
    println(s.toList.sorted.mkString(" "))
  }
}

//another solution
import scala.collection.mutable.ArrayBuffer
object Solution extends App {
    def solve(n: Int, a: Int, b: Int): List[Int] = {
      val solutions = ArrayBuffer[Int]()
      for(i <- 0 to n) {
        solutions.append(a*i+b*(n-i))
      }
      solutions.toList
    }

    for(_ <- 0 until readInt) {
        solve(readInt-1, readInt, readInt).distinct.sorted.foreach(x => print(x + " "))
        println()
    }
}

/*Problem Statement

Manasa is out on a hike with friends. She finds a trail of stones with numbers on them. She starts following the trail and notices that two consecutive stones have a difference of either a or b. Legend has it that there is a treasure trove at the end of the trail and if Manasa can guess the value of the last stone, the treasure would be hers. Given that the number on the first stone was 0, find all the possible values for the number on the last stone.

Note: The numbers on the stones are in increasing order.

Input Format
The first line contains an integer T, i.e. the number of test cases. T test cases follow; each has 3 lines. The first line contains n (the number of stones). The second line contains a, and the third line contains b.

Output Format
Space-separated list of numbers which are the possible values of the last stone in increasing order.

Constraints
1≤T≤10
1≤n,a,b≤103*/
