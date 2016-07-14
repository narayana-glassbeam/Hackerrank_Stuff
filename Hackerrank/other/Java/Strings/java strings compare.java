import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String wanted = sc.next();
        int sub = sc.nextInt();
        String min = wanted.substring(0,sub);
        String max = wanted.substring(0,sub);
        for (int i = 0; i< wanted.length()-(sub-1);i++) {
            String temp = wanted.substring(i,sub+i);
            if(min.compareTo(temp)>0) min = temp;
            if(max.compareTo(temp)<0) max=temp;
        }
        System.out.println(min+"\n"+max);
    }
}

/*Given a string, find out the lexicographically smallest and largest substring of length k.

[Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

Input Format

First line will consist a string containing english alphabets which has at most 1000 characters. 2nd line will consist an integer k.

Output Format

In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.*/
