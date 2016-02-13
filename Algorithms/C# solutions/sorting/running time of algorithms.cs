using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

class Solution {
    public static void insertionSort (int[] A) {
        int j = 0;
        int count = 0;
        for (var i = 1; i < A.Length; i++) {
            int value = A[i];
            j = i - 1;
            while (j >= 0 && value < A[j]) {
                A[j + 1] = A[j];
                j = j - 1;
                count++;
            }
            A[j + 1] = value;

        }
        Console.WriteLine(count);
    }

    static void Main(string[] args) {
        Console.ReadLine();
        int [] _ar = (from s in Console.ReadLine().Split() select Convert.ToInt32(s)).ToArray();
        insertionSort(_ar);
    }
}

/*Challenge
Can you modify your previous Insertion Sort implementation to keep track of the number of shifts it makes while sorting? The only thing you should print is the number of shifts made by the algorithm to completely sort the array. A shift occurs when an element's position changes in the array. Do not shift an element if it is not necessary.

Input Format
The first line contains NN, the number of elements to be sorted. The next line contains NN integers a[1]a[1], a[2]a[2], ..., a[N]a[N].

Output Format
Output the number of shifts it takes to sort the array.

Constraints
1≤N≤10011≤N≤1001
−10000≤x≤10000,x∈a*/
