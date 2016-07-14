object Solution {
    def main(args: Array[String]) {
        val n = readInt
        val arr = Array.fill(n)(0,"")
        for (i <- 0 until n) {
            val Array(x,s) = readLine.split(" ")
            arr(i) = (x.toInt,s)
        }
        val nums = Array.fill(100)(0)
        for (i <- arr) nums(i._1) += 1
        var curr = 0
        for(i <- 0 to 99) {
           curr += nums(i)
           if(curr>0)print(curr+" ")
        }
    }
}

//other solutions
object Solution {
  def main(args: Array[String]): Unit = {
    val n = readInt()
    val a = new Array[Int](n)
    for (i <- 0 until n) a(i) = readLine().split(" ").head.toInt
    val counts = new Array[Int](100)
    for (e <- a) counts(e) += 1
    var cum = 0
    for (i <- 0 to 99) {
      cum += counts(i)
      print(s"$cum ")
    }
    println()
  }
}

//wow
object Solution extends App {
    val ints = (0 until readInt).map(_ => readLine.split(" ")(0).toInt)
    (0 until 100).foreach(n => print(ints.count(x => x<=n) + " "))
}

/*In the previous challenge, it was easy to print all the integers in order, since you did not have to access the original list. Once you had obtained the frequencies of all the integers, you could simply print each integer in order the correct number of times. However, if there is other data associated with an element, you will have to access the original element itself.

In the final counting sort challenge, you are required to print the data associated with each integer. This means, you will go through the original array to get the data, and then use some "helper arrays" to determine where to place everything in a sorted array.

If you know the frequencies of each element, you know how many times to place it, but which index will you start placing it from? It will be helpful to create a helper array for the "starting values" of each element.

Challenge
You will be given a list that contains both integers and strings. In this challenge you just care about the integers. For every value ii from 0to990to99, can you output LL, the number of elements that are less than or equal to ii?

Input Format
- nn, the size of the list arar.
- nn lines follow, each containing an integer xx and a string ss.

Output Format
Output LL for all numbers from 00 to 9999 (inclusive).

Constraints
1≤n≤10000001≤n≤1000000
0≤x<100,x∈ar0≤x<100,x∈ar
length of string ≤10*/
