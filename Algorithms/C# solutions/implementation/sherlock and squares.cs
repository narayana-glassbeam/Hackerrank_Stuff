using System;
using System.Collections.Generic;
using System.Linq;
using System.IO;
class Solution {
    static void Main(String[] args) {
        int T = int.Parse(Console.ReadLine());
        while (T > 0) {
            int[] nums = Console.ReadLine().Split(' ').Select(n => int.Parse(n)).ToArray();
            Console.WriteLine(Math.Floor(Math.Sqrt(nums[1]))-Math.Ceiling(Math.Sqrt(nums[0]))+1);
            T--;
        }
    }
}

/*Problem Statement

Watson gives two integers (A and B) to Sherlock and asks if he can count the number of square integers between A and B (both inclusive).

Note: A square integer is an integer which is the square of any integer. For example, 1, 4, 9, and 16 are some of the square integers as they are squares of 1, 2, 3, and 4, respectively.

Input Format
The first line contains T, the number of test cases. T test cases follow, each in a new line.
Each test case contains two space-separated integers denoting A and B.

Output Format
For each test case, print the required answer in a new line.

Constraints
1≤T≤100
1≤A≤B≤109*/

//brute force, for the sake of learning Linq and C#
Console.WriteLine(Enumerable.Range(nums[0], nums[1] - nums[0] + 1).Where(n => Math.Sqrt(n) % 1 == 0).ToArray().Length);
