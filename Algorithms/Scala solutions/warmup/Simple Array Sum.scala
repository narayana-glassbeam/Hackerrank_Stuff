object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var arr = new Array[Int](n);
        for(arr_i <- 0 to n-1) {
           arr(arr_i) = sc.nextInt();
        }
        println(arr.sum)
    }
}


/*Problem Statement

You are given an array of integers of size N. Can you find the sum of the elements in the array?

Input
The first line of input consists of an integer N. The next line contains N space-separated integers representing the array elements.
Sample:

6
1 2 3 4 10 11
Output
Output a single value equal to the sum of the elements in the array.
For the sample above you would just print 31 since 1+2+3+4+10+11=31.*/
