using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        string time = Console.ReadLine();
            bool isPM = time.Contains("PM");
            if(isPM)
            {
                if (time.Substring(0, 2) == "12")
                {
                    Console.WriteLine(time.Substring(0, time.Length - 2));
                }
                else
                {
                    int hour = Convert.ToInt32(time.Substring(0, 2)) + 12;
                    time = hour.ToString() + time.Substring(2, time.Length - 4);
                    Console.WriteLine(time);
                }
            }
            else
            {
                if (time.Substring(0, 2) == "12")
                {
                    time = "00" + time.Substring(2, time.Length - 4);
                    Console.WriteLine(time);
                }
                else
                {
                    Console.WriteLine(time.Substring(0, time.Length - 2));
                }
            }
    }
}
