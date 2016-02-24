//this solution fails at last test case
object Solution {
    def main(args: Array[String]) {
       val n = readInt
       val arr = Array.fill(n)("")
       for (_ <- 0 until n/2) {
           val i = readLine.split(" ").head.toInt
           arr(i) += "- "
       }
       for (_ <- n/2 until n) {
           val Array(i,s) = readLine.split(" ")
           arr(i.toInt) += s + " "
       }
       println(arr.mkString(""))
    }
}
//had to use mutable ArrayBuffer, to pass it
import collection.mutable.ArrayBuffer
object Solution {
    def main(args: Array[String]) {
       val n = readInt
       val arr = Array.fill(n)(new ArrayBuffer[String])
       for (_ <- 0 until n/2) {
           val i = readLine.split(" ").head.toInt
           arr(i) += "- "
       }
       for (_ <- n/2 until n) {
           val Array(i,s) = readLine.split(" ")
           arr(i.toInt) += s + " "
       }
       println(arr.flatten.mkString(""))
    }
}

//excellent solution
object Solution {
    def main(args: Array[String]) {
       val n = readInt
       val arr = (0 until n).map ({k =>
            val Array(x,s) = readLine.split(" ")
            (x.toInt, if(k<n/2) "-" else s)
       }).sortBy(x => x._1).map(_._2)
       println(arr.mkString(" "))
    }
}

/*In this challenge you need to print the data that accompanies each integer in a list. In addition, if two strings have the same integers, you need to print the strings in their original order. Hence, your sorting algorithm should be stable, i.e. the original order should be maintained for equal elements.

Insertion Sort and the simple version of Quicksort were stable, but the faster in-place version of Quicksort was not (since it scrambled around elements while sorting).

In cases where you care about the original order, it is important to use a stable sorting algorithm. In this challenge, you will use counting sort to sort a list while keeping the order of the strings (with the accompanying integer) preserved.

Challenge
In the previous challenge, you created a "helper array" that contains information about the starting position of each element in a sorted array. Can you use this array to help you create a sorted array of the original list?

Hint: You can go through the original array to access the strings. You can then use your helper array to help determine where to place those strings in the sorted array. Be careful about being one off.

Details and a Twist
You will be given a list that contains both integers and strings. Can you print the strings in order of their accompanying integers? If the integers for two strings are equal, ensure that they are print in the order they appeared in the original list.

The Twist - Your clients just called with an update. They don't want you to print the first half of the original array. Instead, they want you to print a dash for any element from the first half. So you can modify your counting sort algorithm to sort the second half of the array only.

Input Format
- nn, the size of the list arar.
- nn lines follow, each containing an integer xx and a string ss.

Output Format
Print the strings in their correct order.

Constraints
1≤n≤10000001≤n≤1000000
nn is even
1≤1≤ length(s) ≤10≤10
0≤x<100,x∈ar0≤x<100,x∈ar
The characters in every string in lowercase.*/
