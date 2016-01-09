using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
class Solution {

    static void Main(String[] args) {
        int N = int.Parse(Console.ReadLine()); //don't need you sir
        string s = Console.ReadLine();
        int K = int.Parse(Console.ReadLine()) % 26;
        Console.WriteLine(Decipher(s,K));
    }

     private static string Decipher(string cipher, int k)
        {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < cipher.Length; i++)
            {
                if ('a' <= cipher[i] && cipher[i] <= 'z')
                {
                    if (cipher[i] + k > 'z') sb.Append(Convert.ToChar('a' - 1 + (cipher[i] + k) % 'z'));
                    else sb.Append(Convert.ToChar(cipher[i] + k));
                }
                else if ('A' <= cipher[i] && cipher[i] <= 'Z')
                {
                    if (cipher[i] + k > 'Z') sb.Append(Convert.ToChar('A' - 1 + (cipher[i] + k) % 'Z'));
                    else sb.Append(Convert.ToChar(cipher[i] + k));
                }
                else sb.Append(cipher[i]);
            }
            return sb.ToString();
        }
}


//cool solution
using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        var length = int.Parse(Console.ReadLine());
        var s = Console.ReadLine();
        var k = int.Parse(Console.ReadLine());
        foreach (var c in s)
        {
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')))
            {
                Console.Write(c);
            }
            else
            {
                var isLower = (c >= 'a' && c <= 'z');
                var c1 = c.ToString().ToLower()[0];
                c1 += (char)(k % 26);
                if (c1 > 'z')
                {
                    c1 -= (char)26;
                }
                if (!isLower)
                {
                    c1 = c1.ToString().ToUpper()[0];
                }
                Console.Write(c1);
            }
        }
        Console.WriteLine();
    }
}

/*Problem Statement

Julius Caesar protected his confidential information by encrypting it in a cipher. Caesar's cipher rotated every letter in a string by a fixed number, K, making it unreadable by his enemies. Given a string, S, and a number, K, encrypt S and print the resulting string.

Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.

Input Format

The first line contains an integer, N, which is the length of the unencrypted string.
The second line contains the unencrypted string, S.
The third line contains the integer encryption key, K, which is the number of letters to rotate.

Constraints
1≤N≤100
0≤K≤100
S is a valid ASCII string and doesn't contain any spaces.

Output Format

For each test case, print the encoded string.*/
