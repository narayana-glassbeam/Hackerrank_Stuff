using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using System.Linq;
class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
         int N = int.Parse(Console.ReadLine());
            for (int i = 0; i < N; i++)
            {
                Console.WriteLine(new String('#', i+1).PadLeft(N, ' '));
            }
    }
}


/*Problem Statement

Your teacher has given you the task of drawing a staircase structure. Being an expert programmer, you decided to make a program to draw it for you instead. Given the required height, can you print a staircase as shown in the example?

Input
You are given an integer N depicting the height of the staircase.

Output
Print a staircase of height N that consists of # symbols and spaces. For example for N=6, here's a staircase of that height:*/
