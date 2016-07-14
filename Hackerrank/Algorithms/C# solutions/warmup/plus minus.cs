using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
            int positive = 0, negative = 0, neutral = 0;
            int N = int.Parse(Console.ReadLine());
            int[] nums = Console.ReadLine().Split(' ').Select(x => int.Parse(x)).ToArray();
            for (int i = 0; i < N; i++)
            {
                if (nums[i] > 0) positive++;
                else if (nums[i] < 0) negative++;
                else neutral++;
            }
            double res1 = (double) positive / N;
            double res2 = (double)negative / N;
            double res3 = (double) neutral / N;
            Console.WriteLine(res1);
            Console.WriteLine(res2);
            Console.WriteLine(res3);
    }
}

/*Problem Statement

Given an array of integers, calculate which fraction of the elements are positive, negative, and zeroes, respectively. Print the decimal value of each fraction.

Input Format

The first line, N, is the size of the array.
The second line contains N space-separated integers describing the array of numbers (A1,A2,A3,⋯,AN).

Output Format

Print each value on its own line with the fraction of positive numbers first, negative numbers second, and zeroes third.*/
