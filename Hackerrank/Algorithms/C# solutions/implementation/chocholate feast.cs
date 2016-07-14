using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int T = int.Parse(Console.ReadLine());
        while (T>0) {
            int[] info = Array.ConvertAll(Console.ReadLine().Split(' '), Int32.Parse);
            int chocos = info[0] / info[1];
            Console.WriteLine(ChochoRecursive(chocos,chocos,info[2]));
            T--;
        }
    }

    private static int ChochoRecursive(int chocoCount, int wrappers, int cost)
        {
            if (wrappers < cost) return chocoCount;
            else if (wrappers == cost) return chocoCount + 1;
            else
            {
                return ChochoRecursive((wrappers / cost) + chocoCount, (wrappers / cost) + wrappers % cost, cost);
            }
        }
}

/*Problem Statement

Little Bob loves chocolate, and he goes to a store with $N in his pocket. The price of each chocolate is $C. The store offers a discount: for every M wrappers he gives to the store, he gets one chocolate for free. How many chocolates does Bob get to eat?

Input Format:
The first line contains the number of test cases, T.
T lines follow, each of which contains three integers, N, C, and M.

Output Format:
Print the total number of chocolates Bob eats.

Constraints:
1≤T≤1000
2≤N≤105
1≤C≤N
2≤M≤N*/
