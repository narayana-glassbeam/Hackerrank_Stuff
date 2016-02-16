object Solution {
    def main(args: Array[String]) {
            val size = readInt
            val arr = readLine.split(" ").map(_.toInt)
            val pivot = arr(0)
            val (left,right) = arr.partition(_<pivot)
            val result = left++right
            result.foreach(n=> print(n+" "))
    }
}

//my other solution
object Solution {
    def main(args: Array[String]) {
            val size = readInt
            val arr = readLine.split(" ").map(_.toInt)
            val pivot = arr(0)
            val (left,right) = partitioner(pivot,arr)
            val result = left++right
            result.foreach(n=> print(n+" "))
    }

    def partitioner(pivot: Int, arr: Array[Int]): (Array[Int],Array[Int]) = {
       (arr.filter(_<pivot),arr.filter(_>=pivot))
    }
}

//other solutions
var l = List.empty[Int]
var r = List.empty[Int]
case x if x<p => l = x :: l
case x if x>p => r = x :: r

/*The previous challenges covered Insertion Sort, which is a simple and intuitive sorting algorithm with an average case performance of O(n2)O(n2). In these next few challenges, we're covering a divide-and-conquer algorithm called Quicksort (also known as Partition Sort).

Step 1: Divide
Choose some pivot element, pp, and partition your unsorted array, arar, into three smaller arrays: leftleft, rightright, and equalequal, where each element in left<pleft<p, each element in right>pright>p, and each element in equal=pequal=p.

Challenge
Given arar and p=ar[0]p=ar[0], partition arar into leftleft, rightright, and equalequal using the Divide instructions above. Then print each element in leftleft followed by each element in equalequal, followed by each element in rightright on a single line. Your output should be space-separated.

Note: There is no need to sort the elements in-place; you can create two lists and stitch them together at the end.

Input Format

The first line contains nn (the size of arar).
The second line contains nn space-separated integers describing arar (the unsorted array). The first integer (corresponding to ar[0]ar[0]) is your pivot element, pp.

Constraints

1≤n≤10001≤n≤1000
−1000≤x≤1000,x∈ar−1000≤x≤1000,x∈ar
All elements will be unique.
Multiple answer can exists for the given test case. Print any one of them.
Output Format

On a single line, print the partitioned numbers (i.e.: the elements in leftleft, then the elements in equalequal, and then the elements in rightright). Each integer should be separated by a single space.*/
