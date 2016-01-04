object Solution {

    def main(args: Array[String]) {
        var T = readInt
        while(T > 0){
            var n = readLine
            println(findDigit(n))
            T -= 1
        }
    }

    def findDigit(num: String): Int = {
        var counter = 0
        for (c <- num) {
            if (c.asDigit != 0 && num.toInt%c.asDigit==0)counter += 1
        }
        counter
    }
}

/*Problem Statement

Given an integer, N, traverse its digits (d1,d2,...,dn) and determine how many digits evenly divide N (i.e.: count the number of times N divided by each digit di has a remainder of 0). Print the number of evenly divisible digits.

Note: Each digit is considered to be unique, so each occurrence of the same evenly divisible digit should be counted (i.e.: for N=111, the answer is 3).

Input Format

The first line is an integer, T, indicating the number of test cases.
The T subsequent lines each contain an integer, N.

Constraints
1≤T≤15
0<N<1010
Output Format

For every test case, count and print (on a new line) the number of digits in N that are able to evenly divide N.*/
