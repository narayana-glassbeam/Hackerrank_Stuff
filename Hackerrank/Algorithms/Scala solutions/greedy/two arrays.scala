object Solution {

    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            val Array(n,k)= readLine.split(" ").map(_.toInt)
            val arrA = readLine.split(" ").map(_.toInt).sortWith(_>_)
            val arrB = readLine.split(" ").map(_.toInt).sortWith(_<_)
            var go = true
            for (i <- 0 until n if go) {
                if (arrA(i)+arrB(i)<k) go=false
            }
            println(if(go)"YES"else"NO")
        }
    }
}
//or
val arrB = readLine.split(" ").map(_.toInt).sorted.reverse
//this only works for strings (_.size)
def Desc[T : Ordering] = implicitly[Ordering[T]].reverse
List("1","22","4444","333").sortBy( _.size )(Desc)


//other solutions
object Solution extends App {
  val t = readInt()
  for(i <- 1 to t) {
    val k = readLine().split(" ").toArray.apply(1).toInt
    val a = readLine().split(" ").map(_.toInt).toArray.sorted
    val b = readLine().split(" ").map(_.toInt).toArray.sorted.reverse
    val f = (a zip b).forall(x => x._1 + x._2 >= k)
    if(f) println("YES")
    else println("NO")
  }
}

/*You are given two integer arrays, A and B, each containing N integers. The size of the array is less than or equal to 1000. You are free to permute the order of the elements in the arrays.

Now here's the real question: Is there an permutation A', B' possible of A and B, such that, A'i+B'i ≥ K for all i, where A'i denotes the ith element in the array A' and B'i denotes ith element in the array B'.


Input Format
The first line contains an integer, T, the number of test-cases. T test cases follow. Each test case has the following format:

The first line contains two integers, N and K. The second line contains N space separated integers, denoting array A. The third line describes array B in a same format.

Output Format
For each test case, if such an arrangement exists, output "YES", otherwise "NO" (without quotes).


Constraints
1 <= T <= 10
1 <= N <= 1000
1 <= K <= 109
0 <= Ai, Bi ≤ 109*/
