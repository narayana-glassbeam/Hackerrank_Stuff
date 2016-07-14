import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count = 1;
        while(sc.hasNext()) {
            System.out.println(count+ " " + sc.nextLine());
            count++;
        }
    }
}

//editorial
import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int c=0;
        while(sc.hasNext())System.out.println(++c+" "+sc.nextLine());

    }
}

/*"In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source." — (Wikipedia: End-of-file)

The challenge here is to read nn lines of input until you reach EOF, then number and print all nn lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown nn lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input:

k This is the line read as input for line number 'k'.*/
