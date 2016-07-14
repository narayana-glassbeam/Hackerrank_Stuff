object Solution {
    def main(args: Array[String]) {
        for(_ <- 0 until readInt) {
            val m = readInt
            val n = readInt
            val flavors = readLine.split(" ").map(_.toInt)
            var go = true
            for(i <- 0 until n-1 if go) {
                for (j <- i+1 until n) {
                    if (flavors(i)+flavors(j)==m){
                        println(s"${i+1} ${j+1}")
                        go = false
                    }
                }
            }
        }
    }
}

//other solutions
object Solution {
  def main(args: Array[String]): Unit = {
    for (_ <- 0 until readInt) {
      val m = readInt
      val n = readInt
      val flavors = readLine.split(" ").map(_.toInt)
      val seen = Array.fill[Int](10001)(-1)
      for (i <- 0 until n) {
        val j = m - flavors(i)
        if (j > 0 && seen(j) >= 0) println(seen(j) + " " + (i + 1))
        else seen(flavors(i)) = i + 1
      }
    }
  }
}

/*Sunny and Johnny together have MM dollars they want to spend on ice cream. The parlor offers NN flavors, and they want to choose two flavors so that they end up spending the whole amount.

You are given the cost of these flavors. The cost of the iithth flavor is denoted by ccii. You have to display the indices of the two flavors whose sum is MM.

Input Format

The first line of the input contains TT; TT test cases follow.
Each test case follows the format detailed below: The first line contains MM. The second line contains NN. The third line contains NN space-separated integers denoting the price of each flavor. Here, the iithth integer denotes ccii.

Output Format

Output two integers, each of which is a valid index of a flavor. The lower index must be printed first. Indices are indexed from 11 to NN.

Constraints

1≤T≤501≤T≤50
2≤M≤100002≤M≤10000
2≤N≤100002≤N≤10000
1≤c1≤cii ≤10000,where i∈[1,N]≤10000,where i∈[1,N]
The prices of any two items may be the same and each test case has a unique solution.*/
