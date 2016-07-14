object Solution {
    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            val N = readLong

            val n3 = (N-1)/3
            val n5 = (N-1)/5
            val n15 = (N-1)/15

            val a3 = 3 * n3 * (n3+1)/2;
            val a5 = 5 * n5 * (n5+1)/2;
            val a15 = 15 * n15 * (n15+1)/2;

            println(a3+a5-a15)
        }
    }
}

//this one times out on 2 test cases
object Solution {
    def main(args: Array[String]) {
           for (_ <- 0 until readInt) {
                val N = readInt
                val sol = (3 until N by 3).toList++(5 until N by 5)
                println(sol.distinct.sum)
        }
    }
}

/*Problem Statement

This problem is a programming version of Problem 1 from projecteuler.net

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below N.

Input Format
First line contains T that denotes the number of test cases. This is followed by T lines, each containing an integer, N.

Output Format
For each test case, print an integer that denotes the sum of all the multiples of 3 or 5 below N.*/
