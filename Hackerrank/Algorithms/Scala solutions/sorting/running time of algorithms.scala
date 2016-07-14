object Solution {

    def main(args: Array[String]) {
       val size = readInt
       val arr = readLine.split(" ").map(_.toInt)
       var count = 0
       for (i <- 1 until arr.length) {
           for (j <- 0 until i) {
               if (arr(i)<arr(j)) {
                   val temp = arr(i)
                   arr(i)=arr(j)
                   arr(j)=temp
                   count+=1
               }
           }
       }
       println(count)
    }
}

/*Challenge
Can you modify your previous Insertion Sort implementation to keep track of the number of shifts it makes while sorting? The only thing you should print is the number of shifts made by the algorithm to completely sort the array. A shift occurs when an element's position changes in the array. Do not shift an element if it is not necessary.

Input Format
The first line contains NN, the number of elements to be sorted. The next line contains NN integers a[1]a[1], a[2]a[2], ..., a[N]a[N].

Output Format
Output the number of shifts it takes to sort the array.

Constraints
1≤N≤10011≤N≤1001
−10000≤x≤10000,x∈a*/
