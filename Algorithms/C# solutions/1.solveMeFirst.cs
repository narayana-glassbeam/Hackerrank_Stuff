using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static int solveMeFirst(int a, int b) {
        return a+b;
    }
    static void Main(String[] args) {
        int val1 = Convert.ToInt32(Console.ReadLine());
        int val2 = Convert.ToInt32(Console.ReadLine());
        int sum = solveMeFirst(val1,val2);
        Console.WriteLine(sum);
    }
}

/*Problem Statement

Let's start simple. Can you complete the function solveMeFirst to return the sum of two integers passed as input parameters? You can pick your favorite programming language.*
