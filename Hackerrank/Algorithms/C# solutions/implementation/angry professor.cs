using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
          int T = int.Parse(Console.ReadLine());
            while(T>0)
            {
                int[] NK = Console.ReadLine().Split(' ').Select(x => int.Parse(x)).ToArray();
                int studentCount = NK[0];
                int wantedNumber = NK[1];
                int actualNumber = 0;
                int[] students = new int[studentCount];
                students = Console.ReadLine().Split(' ').Select(x => int.Parse(x)).ToArray();
                for (int i = 0; i < studentCount; i++)
                {
                    if (students[i] <= 0) actualNumber++;
                }
                Console.WriteLine(actualNumber>=wantedNumber ? "NO" : "YES");
            }
                T--;
    }

}

/*Problem Statement

A Discrete Mathematics professor has a class of N students. Frustrated with their lack of discipline, he decides to cancel class if fewer than K students are present when class starts.

Given the arrival time of each student, determine if the class is canceled.

Input Format

The first line of input contains T, the number of test cases.

Each test case consists of two lines. The first line has two space-separated integers, N (students in the class) and K (the cancelation threshold).
The second line contains N space-separated integers (a1,a2,…,aN) describing the arrival times for each student.

Note: Non-positive arrival times (ai≤0) indicate the student arrived early or on time; positive arrival times (ai>0) indicate the student arrived ai minutes late.

Output Format

For each test case, print the word YES if the class is canceled or NO if it is not.

Constraints

1≤T≤10
1≤N≤1000
1≤K≤N
−100≤ai≤100,where i∈[1,N]
Note
If a student arrives exactly on time (ai=0), the student is considered to have entered before the class started.*/
