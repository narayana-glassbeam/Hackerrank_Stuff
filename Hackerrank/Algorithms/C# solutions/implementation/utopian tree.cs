using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int T = int.Parse(Console.ReadLine());
        while(T>0) {
            int tree = int.Parse(Console.ReadLine());
            Console.WriteLine(Solve(tree));
            T-=1;
        }
    }

    static int Solve(int n) {
        if (n==0) return 1;
        else {
            int tree = 1;
            for (int i = 1; i <= n; i++) {
                if (i%2!=0) tree*=2;
                else tree += 1;
            }
            return tree;
        }
    }
}

/*Problem Statement

The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after N growth cycles?

Input Format

The first line contains an integer, T, the number of test cases.
T subsequent lines each contain an integer, N, denoting the number of cycles for that test case.

Constraints
1≤T≤10
0≤N≤60
Output Format

For each test case, print the height of the Utopian Tree after N cycles. Each height must be printed on a new line.*/
