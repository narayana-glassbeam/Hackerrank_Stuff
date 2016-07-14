object Solution {
    def main(args: Array[String]) {
        for (_ <- 0 until readInt)
        {
            val arr = readLine.split(' ').toList.map(_.toInt)
            var num = arr(0)
                for (i <- 0 until arr(2)) {
                    num += ((Math.pow(2,i)).toInt*arr(1))
                    print(num+" ")
                    if(arr(2)-i==1)println
            }
        }
    }
}


/*Problem Statement

Welcome to Day 5! Check out the video review of loops here, or just jump right into the problem.

In this problem you will test your knowledge of loops. Given three integers a, b, and N, output the following series:

a+20b,a+20b+21b,......,a+20b+21b+...+2N−1b
Input Format

The first line will contain the number of testcases T. Each of the next T lines will have three integers, a, b, and N.

Constraints

0≤T≤500
0≤a,b≤50
1≤N≤15
Output Format

Print the answer to each test case in a separate line.*/
