using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        int sizeOfArray = int.Parse(Console.ReadLine());
            int[] numbers = Console.ReadLine().Split(' ').Select(x => Convert.ToInt32(x)).ToArray();
            Console.WriteLine(numbers.Sum());
    }
}

/*Problem Statement

You are given an array of integers of size N. Can you find the sum of the elements in the array?

Input
The first line of input consists of an integer N. The next line contains N space-separated integers representing the array elements.
Sample:

6
1 2 3 4 10 11
Output
Output a single value equal to the sum of the elements in the array.
For the sample above you would just print 31 since 1+2+3+4+10+11=31.*/
