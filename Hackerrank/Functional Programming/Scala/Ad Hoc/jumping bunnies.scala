object Solution {
    def main(args: Array[String]) {
        val bunnies = readInt
        val jumps = readLine.split(" ").map(_.toLong)
        println(jumps.foldLeft(1L)((a,b)=>lcm(a,b)))
    }
    def gcd(a: Long, b: Long):Long=if (b==0) a else gcd(b, a%b)
    def lcm(a: Long, b: Long)=(a/gcd(a,b))*b
}

//other solutions
object Solution {
    def gcd(a: Long, b: Long): Long = if (b == 0) a else gcd(b, a % b)
    def lcm(a:Long, b:Long):Long = {a / gcd(a,b) * b}
    def main(args: Array[String]) {
      val n = readInt()
      val a = readLine.split(" ").map(_.toLong)
      var r = 1L
      for (i<-0 until n) r = lcm(r,a(i))
      println(r)
    }
}

//just what the doctor ordered :)
object Solution {
  def main(args: Array[String]) {
    val N = readInt()
    val str = readLine()
    val num = str.split(" ").toList.map(BigInt(_))
    println(solve(num))
  }
  def solve(num: List[BigInt]): BigInt = num match {
    case List(x, y, _*) => solve(List(lcm(x, y)) ::: num.drop(2) )
    case x :: _ => x
  }
  def lcm(a: BigInt, b: BigInt): BigInt = {
    (a * b) / a.gcd(b)
  }
}
//my implementation of his/her 'solve' method
 def solve(num: List[BigInt]): BigInt = num match {
    case h1::h2::t => solve(List(lcm(h1, h2)) ::: t )
    case _ => num.head
  }

//similar
object Solution {
  def lcm(a:BigInt, b:BigInt):BigInt = (a*b).abs/(a.gcd(b))

  def main(args: Array[String]) {
    val n = readInt()
    val arr:Array[Long] = readLine().split(" ").map(_.toLong)
    println(arr.foldLeft(BigInt(1L))((a, b) => lcm(a, b)))
  }
}


/*Bunnies are very cute animals who likes to jump a lot. Every bunny has his own range of jump. Lets say there are N bunnies and ith (i∈[1,N]) bunny jumps ji units. Consider a 1-D plane, where initially bunnies are at 0. All of them starts jumping in forward direction.

For example, consider the case of kth bunny. Initially he is at 0. After first jump, he will be at point jk. After second, he will be at 2×jk and so on. After mth jump, he will be at point m×jk.

Two bunnies can only meet each other when they are on the ground. When on the ground, a bunny can wait any amount of time. Being a social animal, all of them decide to meet at the next point where all of them will be on the ground. You have to find the nearest point where all the bunnies can meet.

For example, if there are N=3 bunnies where j1=2, j2=3, j3=4. Nearest point where all bunnies can meet again is at 12. First bunny has to jump six times, for second it is 4 times and for third it is 3 times.

Help bunnies to find the nearest point where they can meet again.

Input Format
First line will contain an integer, N, represeting the number of bunnies. Second line will contain N space separated integer, j1,j2,⋯,jN, representing the jumping distance of them.

Output Format
Print the nearest location where all bunnies can meet again.

Constraints
2≤N≤10
1≤ji≤106
For each test case it is guaranteed that solution will not exceed 2×1018.*/
