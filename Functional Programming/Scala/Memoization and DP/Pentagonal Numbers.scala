object Solution {
    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
         var T = readInt;
        while (T>0) {
            println(solve(readLong))
                T = T - 1
        }
    }

    def solve(n:Long) : Long = {
        ((3 * n * n - n) / 2).toLong
    }
}

/*Problem Statement

Pentagonal numbers are the number of dots that can be shown in a pentagonal pattern of dots. Let's represent the nth pentagonal number by P(n). The following figure depicts pentagonal patterns for n ∈ {1, 2, 3, 4, 5}.

Your task is to find the value of P(n) for a given n.

Input
The first line will contain an integer T, which represents the number of test cases. Then T lines, each representing a single test case, follow. Each test case contains an integer n.

Output
For each test case, print the nth pentagonal number, P(n), in separate line.

Constraints
1 <= T <= 105
1 <= n <= 105*/
