using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
       int T = Convert.ToInt32(Console.ReadLine());
        while (T-- > 0)
        {
            int[] BW = Array.ConvertAll(Console.ReadLine().Split(' '), Int32.Parse);
            int[] XYZ = Array.ConvertAll(Console.ReadLine().Split(' '), Int32.Parse);
            long BX = (long) BW[0]*Math.Min(XYZ[0],XYZ[1]+XYZ[2]);
            long BY = (long) BW[1] * Math.Min(XYZ[1], XYZ[0] + XYZ[2]);
            Console.WriteLine(BX+BY);
        }
    }
}

/*Taum is planning to celebrate the birthday of his friend, Diksha. There are two types of gifts that Diksha wants from Taum: one is black and the other is white. To make her happy, Taum has to buy B number of black gifts and W number of white gifts.

The cost of each black gift is X units.
The cost of every white gift is Y units.
The cost of converting each black gift into white gift or vice versa is Z units.
Help Taum by deducing the minimum amount he needs to spend on Diksha's gifts.

Input Format

The first line will contain an integer T which will be the number of test cases.
There will be T pairs of lines. The first line of each test case will contain the values of integers B and W. Another line of each test case will contain the values of integers X, Y, and Z.

Constraints
1≤T≤10
0≤X,Y,Z,B,W≤109
Output Format

T lines, each containing an integer: the minimum amount of units Taum needs to spend on gifts.*/
