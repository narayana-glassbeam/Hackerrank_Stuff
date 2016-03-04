object Solution {
    def main(args: Array[String]) {
        val n = readInt
        val k = readInt
        val arr = Array.fill(n)(0)
        for (i <- 0 until n) {
            arr(i) = readInt
        }
        val sorted = arr.sorted
        var min = Int.MaxValue
        for (i <- 0 to arr.length-k) {
            var curr = sorted(k+i-1)-sorted(i)
            if(curr < min) min = curr
        }
        println(min)
    }
}

//other solutions
object Solution extends App {
    val in = new java.util.Scanner(System.in)
    val (n, k) = (in.nextInt, in.nextInt)
    val candies = Seq.fill(n){in.nextInt}.sorted
    val groups = candies zip candies.slice(k-1, candies.size)
    println(groups map {p => p._2 - p._1} min)
}

object Solution {
    def main(args: Array[String]) {
      val size = readInt()
      val k    = readInt()
      val input = (1 to size).map { _ => readInt() }.toVector.sorted
      println((0 to (size - k)).map(i => input(i + (k-1)) - input(i)).min)

    }
}

/*Given a list of NN integers, your task is to select KK integers from the list such that its unfairness is minimized.

if (x1,x2,x3,…,xk)(x1,x2,x3,…,xk) are KK numbers selected from the list NN, the unfairness is defined as

max(x1,x2,…,xk)−min(x1,x2,…,xk)
max(x1,x2,…,xk)−min(x1,x2,…,xk)
where max denotes the largest integer among the elements of KK, and min denotes the smallest integer among the elements of KK.

Input Format
The first line contains an integer NN.
The second line contains an integer KK.
NN lines follow. Each line contains an integer that belongs to the list NN.

Note: Integers in the list NN may not be unique.

Output Format
An integer that denotes the minimum possible value of unfairness.

Constraints
2≤N≤1052≤N≤105
2≤K≤N2≤K≤N
0≤integer in N ≤109*/
