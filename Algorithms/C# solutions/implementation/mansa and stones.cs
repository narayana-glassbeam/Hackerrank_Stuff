using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        int T = int.Parse(Console.ReadLine());
        while (T > 0) {
            int n = int.Parse(Console.ReadLine());
            int a = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());

            int stoneA = Math.Min(a,b);
            int stoneB = Math.Max(a,b);
            int firstNum = stoneA * (n-1);
            if (stoneA == stoneB) Console.WriteLine(firstNum);
            else {
                int lastNum = stoneB * (n-1);
                int diff = stoneB - stoneA;
                while (firstNum<= lastNum) {
                    Console.Write(firstNum+" ");
                    firstNum+= diff;
                }
                Console.WriteLine();
            }
            T--;
        }
    }
}

/*Problem Statement

Manasa is out on a hike with friends. She finds a trail of stones with numbers on them. She starts following the trail and notices that two consecutive stones have a difference of either a or b. Legend has it that there is a treasure trove at the end of the trail and if Manasa can guess the value of the last stone, the treasure would be hers. Given that the number on the first stone was 0, find all the possible values for the number on the last stone.

Note: The numbers on the stones are in increasing order.

Input Format
The first line contains an integer T, i.e. the number of test cases. T test cases follow; each has 3 lines. The first line contains n (the number of stones). The second line contains a, and the third line contains b.

Output Format
Space-separated list of numbers which are the possible values of the last stone in increasing order.

Constraints
1≤T≤10
1≤n,a,b≤103*/
