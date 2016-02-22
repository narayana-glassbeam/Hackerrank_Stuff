object Solution {
    def main(args: Array[String]) {
        val n = readInt
        val arr = readLine.split(" ").map(_.toInt)
        val nums = new Array[Int](100)
        for (i <- 0 until n) {
            nums(arr(i)) = nums(arr(i)) + 1
        }
        nums.foreach(x=> print(x + " "))
    }
}

//other solutions
object Solution {
  def main(args: Array[String]): Unit = {
    val n = readInt()
    val a = readLine().split(" ").map(_.toInt)
    val counts = new Array[Int](100)
    for (e <- a) counts(e) += 1
    println(counts.mkString(" "))
  }
}

object Solution extends App {
    readInt
    val array = readLine.split(" ").map(s => s.toInt)
    (0 until 100).map(nb => array.count(x => x==nb)).foreach(x => print(x + " "))
}

var arr = Array.fill(100){0}

/*Comparison Sorting
Quicksort usually has a running time of n×log(n)n×log(n), but is there an algorithm that can sort even faster? In general, this is not possible. Most sorting algorithms are comparison sorts, i.e. they sort a list just by comparing the elements to one another. A comparison sort algorithm cannot beat n×log(n)n×log(n) (worst-case) running time, since n×log(n)n×log(n) represents the minimum number of comparisons needed to know where to place each element. For more details, you can see these notes (PDF).

Alternative Sorting
However, for certain types of input, it is more efficient to use a non-comparison sorting algorithm. This will make it possible to sort lists even in linear time. These challenges will cover Counting Sort, a fast way to sort lists where the elements have a small number of possible values, such as integers within a certain range. We will start with an easy task - counting.

Challenge
Given a list of integers, can you count and output the number of times each value appears?

Hint: There is no need to sort the data, you just need to count it.

Input Format
There will be two lines of input:

nn - the size of the list
arar - nn space-separated numbers that make up the list
Output Format
Output the number of times every number from 00 to 9999 (inclusive) appears on the list.

Constraints
100≤n≤10100≤n≤1066
0≤x<100,x∈ar*/
