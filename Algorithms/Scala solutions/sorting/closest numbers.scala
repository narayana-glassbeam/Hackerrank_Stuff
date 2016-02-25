object Solution {
    def main(args: Array[String]) {
        val n = readInt
        val arr = readLine.split(" ").map(_.toInt).sorted
        var diff = Int.MaxValue
        var p = new StringBuilder("")
        for (i <- 0 until n-1) {
            val curr = math.abs(arr(i)-arr(i+1))
            if (curr<diff) {
                diff = curr
                p.setLength(0)
                p.append(arr(i).toString+" "+arr(i+1).toString+" ")
            } else if (curr==diff) {
                 p.append(arr(i).toString+" "+arr(i+1).toString+" ")
            }
        }
        println(p)
    }
}

/*Sorting is often useful as the first step in many different tasks. The most common task is to make finding things easier, but there are other uses, as well.

Challenge
Given a list of unsorted integers, A={a1,a2,…,aN}A={a1,a2,…,aN}, can you find the pair of elements that have the smallest absolute difference between them? If there are multiple pairs, find them all.

Input Format
The first line of input contains a single integer, NN, representing the length of array AA.
In the second line, there are NN space-separated integers, a1,a2,…,aNa1,a2,…,aN, representing the elements of array AA.

Output Format
Output the pairs of elements with the smallest difference. If there are multiple pairs, output all of them in ascending order, all on the same line (consecutively) with just a single space between each pair of numbers. If there's a number which lies in two pair, print it two times (see the sample case #3 for explanation).*/
