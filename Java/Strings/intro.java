import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0 ? "Yes" : "No");
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+ " " + B.substring(0,1).toUpperCase()+B.substring(1));
    }
}

/*Given two strings of lowercase English letters, AA and BB, perform the following operations:

Sum the lengths of AA and BB.
Determine if AA is lexicographically larger than BB (i.e.: does BB come before AA in the dictionary?).
Capitalize the first letter in AA and BB and print them on a single line, separated by a space.
Input Format

Two strings, the first being AA and the second being BB. They are comprised of lowercase English letters (no symbols or spaces) and may not be on the same line.

Output Format

There are three lines of output:
For the first line, sum the lengths of AA and BB.
For the second line, write Yes if AA is lexicographically larger than BB or No if it is not.
For the third line, capitalize the first letter in both AA and BB and print them on a single line, separated by a space.*/
