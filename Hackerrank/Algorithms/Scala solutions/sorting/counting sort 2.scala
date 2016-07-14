object Solution {
    def main(args: Array[String]) {
        val n = readInt
        val arr = readLine.split(" ").map(_.toInt)
        val nums = Array.fill(100)(0)
        for (i <- arr) nums(i) += 1

        for (i <- 0 until nums.length) {
            for (j <- 0 until nums(i)) print(i+" ")
        }
    }
}

//other solution (way better)
object Solution {
  def main(args: Array[String]): Unit = {
    val n = readInt()
    val a = readLine().split(" ").map(_.toInt)
    val counts = new Array[Int](100)
    for (e <- a) counts(e) += 1
    for (i <- 0 to 99 if counts(i) > 0) {
      print(s"$i " * counts(i))
    }
    println()
  }
}

/*Often, when a list is sorted, the elements being sorted are just keys to other values. For example, if you are sorting files by their size, the sizes need to stay connected to their respective files. You cannot just take the size numbers and output them in order, you need to output all the required file information.

However, if you are not concerned about any other information, then you can simply sort those numbers alone. This makes counting sort very simple. If you already counted the values in the list, you don't need to access the original list again. This challenge involves a simple counting sort where the elements being sorted are all that matter.

Challenge
Given an unsorted list of integers, output the integers in order.

Hint: You can use your previous code that counted the items to print out the actual values in order.

Input Format
There will be two lines of input:

nn - the size of the list
arar - nn space separated numbers that belong to the list
Output Format
Output all the numbers of the list in order.

Constraints
0≤n≤10000000≤n≤1000000
0≤x<100,x∈ar*/
