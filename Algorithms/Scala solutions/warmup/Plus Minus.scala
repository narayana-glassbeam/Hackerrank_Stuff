object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var arr = new Array[Int](n);
        for(arr_i <- 0 to n-1) {
           arr(arr_i) = sc.nextInt();
        }
        solve(arr).productIterator.foreach(println)
    }

    def solve(list: Array[Int]): (Float, Float, Float) = {
        val f = list.length.toFloat
        val pos = list.count(_ > 0) / f
        val neg = list.count(_ < 0) / f
        val neu = list.count(_ == 0) / f

        (pos,neg,neu)
    }
}

/*Problem Statement

Given an array of integers, calculate which fraction of the elements are positive, negative, and zeroes, respectively. Print the decimal value of each fraction.

Input Format

The first line, N, is the size of the array.
The second line contains N space-separated integers describing the array of numbers (A1,A2,A3,⋯,AN).

Output Format

Print each value on its own line with the fraction of positive numbers first, negative numbers second, and zeroes third.*/
