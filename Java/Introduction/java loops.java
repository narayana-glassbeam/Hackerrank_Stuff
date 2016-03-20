import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for(int i=0; i< n;i++) {
                a += Math.pow(2,i)*b;
                System.out.print(a+" ");
            }
            System.out.println();
            t--;
        }
    }
}

//editorial solution
import java.util.*;
import java.io.*;
class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            int n=in.nextInt();
            for(int j=0;j<n;j++)
            {
                a+=b;
                if(j>0)
                System.out.print(" ");
                System.out.print(a);

                b=b*2;
            }
            System.out.println("");
        }
    }
}

/*In this problem you will test your knowledge of Java loops. Given three integers aa, bb, and nn, output the following series:

a+20b,a+20b+21b,......,a+20b+21b+...+2n−1ba+20b,a+20b+21b,......,a+20b+21b+...+2n−1b
Input Format

The first line will contain the number of testcases t. Each of the next tt lines will have three integers, aa, bb, and nn.

Constraints:

0≤t≤5000≤t≤500
0≤a,b≤500≤a,b≤50
1≤n≤151≤n≤15
Output Format

Print the answer to each test case in separate lines.*/
