object Solution {
    def main(args: Array[String]): Unit = {
        val sizeMatters = readInt
        val arr = readLine.split(" ").map(_.toInt)
        quicksort(arr)
    }

   def partitioner(pivot: Int, arr: Array[Int]): (Array[Int],Array[Int]) = {
       (arr.filter(_<pivot),arr.filter(_>pivot))
    }

   def quicksort(arr: Array[Int]): Array[Int] = {
        if(arr.length<2) return arr
        val (left,right) = partitioner(arr.head, arr.tail)
        val result = quicksort(left) ++ (arr.head +: quicksort(right))
        println(result.mkString(" "))
        result
    }
}

/*In the previous challenge, you wrote a partition method to split an array into two sub-arrays, one containing smaller elements and one containing larger elements than a given number. This means you 'sorted' half the array with respect to the other half. Can you repeatedly use partition to sort an entire array?

Guideline
In Insertion Sort, you simply went through each element in order and inserted it into a sorted sub-array. In this challenge, you cannot focus on one element at a time, but instead must deal with whole sub-arrays, with a strategy known as "divide and conquer".

When partition is called on an array, two parts of the array get 'sorted' with respect to each other. If partition is then called on each sub-array, the array will now be split into four parts. This process can be repeated until the sub-arrays are small. Notice that when partition is called on just one numbers, they end up being sorted.

Can you repeatedly call partition so that the entire array ends up sorted?

Print Sub-Arrays
In this challenge, print your array every time your partitioning method finishes, i.e. whenever two subarrays, along with the pivot, is merged together.

The first element in a sub-array should be used as a pivot.
Partition the left side before partitioning the right side.
The pivot should be placed between sub-arrays while merging them.
Array of length 11 or less will be considered sorted, and there is no need to sort or to print them.
Note
Please maintain the original order of the elements in the left and right partitions while partitioning around a pivot element.

For example: Partition about the first element for the array A[]={5, 8, 1, 3, 7, 9, 2} will be {1, 3, 2, 5, 8, 7, 9}

Input Format
There will be two lines of input:

nn - the size of the array
arar - the n numbers of the array
Output Format
Print every partitioned sub-array on a new line.

Constraints
1≤n≤10001≤n≤1000
−1000≤x≤1000,x∈ar−1000≤x≤1000,x∈ar
Each number is unique.*/
