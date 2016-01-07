using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
       int N = int.Parse(Console.ReadLine());
            int[] sticks = Array.ConvertAll(Console.ReadLine().Split(' '), Int32.Parse);

            while(sticks.Length>0)
            {
                Console.WriteLine(sticks.Length);
                int min = sticks.Min();
                sticks = sticks.Where(s => s > min).ToArray();
            }
    }
}


//recursion wise
class Solution {
    static void Main(String[] args) {
            int N = int.Parse(Console.ReadLine());
            int[] sticks = Array.ConvertAll(Console.ReadLine().Split(' '), Int32.Parse);
            Cut(sticks);
    }
    private static void Cut(int[] sticks) {
        if (sticks.Length!=0) {
            Console.WriteLine(sticks.Length);
            int min = sticks.Min();
            sticks = sticks.Where(s => s > min).ToArray();
            Cut(sticks);
        }
    }
}

/*Problem Statement

You are given N sticks, where the length of each stick is a positive integer. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.

Suppose we have six sticks of the following lengths:
5 4 4 2 2 8

Then, in one cut operation we make a cut of length 2 from each of the six sticks. For the next cut operation four sticks are left (of non-zero length), whose lengths are the following:
3 2 2 6

The above step is repeated until no sticks are left.

Given the length of N sticks, print the number of sticks that are left before each subsequent cut operations.

Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).

Input Format
The first line contains a single integer N.
The next line contains N integers: a0, a1,...aN-1 separated by space, where ai represents the length of ith stick.

Output Format
For each operation, print the number of sticks that are cut, on separate lines.

Constraints
1 ≤ N ≤ 1000
1 ≤ ai ≤ 1000*/
