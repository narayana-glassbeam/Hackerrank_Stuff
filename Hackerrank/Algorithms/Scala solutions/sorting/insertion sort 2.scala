object Solution {

    def main(args: Array[String]) {
       val size = readInt
       val arr = readLine.split(" ").map(_.toInt)
       for (i <- 1 until arr.length) {
           for (j <- 0 until i) {
               if (arr(i)<arr(j)) {
                   val temp = arr(i)
                   arr(i)=arr(j)
                   arr(j)=temp
               }
           }
          arr.foreach(x => print(x+" "))
          println()
       }
    }
}


/*In Insertion Sort Part 1, you sorted one element into an array. Using the same approach repeatedly, can you sort an entire unsorted array?

Guideline: You already can place an element into a sorted array. How can you use that code to build up a sorted array, one element at a time? Note that in the first step, when you consider an element with just the first element - that is already "sorted" since there's nothing to its left that is smaller.

In this challenge, don't print every time you move an element. Instead, print the array after each iteration of the insertion-sort, i.e., whenever the next element is placed at its correct position.

Since the array composed of just the first element is already "sorted", begin printing from the second element and on.

Input Format
There will be two lines of input:

ss - the size of the array
arar - a list of numbers that makes up the array
Output Format
On each line, output the entire array at every iteration.

Constraints
1≤s≤10001≤s≤1000
−10000≤x≤10000,x∈ar*/
