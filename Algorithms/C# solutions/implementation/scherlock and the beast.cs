using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
         int T = int.Parse(Console.ReadLine());
        string three = "555";
            string five = "33333";

        while (T > 0)
            {
                int n = int.Parse(Console.ReadLine());
                StringBuilder sb = new StringBuilder();
                int res = n / 3;
                while (res > 0)
                {
                    sb.Append(three);
                    res--;
                }
                int resFinal = n % 3;
                while (resFinal != 0 && sb.Length > 0)
                {
                        sb = sb.Remove(0, 3);
                        resFinal += 3;
                        if (resFinal % 5 == 0)
                            break;
                }
                if (resFinal % 5 == 0)
                {
                    while (resFinal > 0)
                    {
                        sb.Insert(sb.Length, five);
                        resFinal -= 5;
                    }
                    Console.WriteLine(sb.ToString());
                }
                else
                {
                    Console.WriteLine(-1);
                }

            T--;
        }
    }
}
