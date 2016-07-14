using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
             int diagonalLeft = 0, diagonalRight = 0, diagonalDifference = 0;
            int N = int.Parse(Console.ReadLine());
            for (int i = 0; i < N; i++)
            {
                string[] elements = Console.ReadLine().Split(' ');
                diagonalLeft += int.Parse(elements[i]);
                diagonalRight += int.Parse(elements[N - 1 - i]);
            }
            diagonalDifference = Math.Abs(diagonalLeft - diagonalRight);
            Console.WriteLine(diagonalDifference);
    }
}

/*Problem Statement

Given a square matrix of size N×N, calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line containing N space-separated integers describing the columns.

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.*/
