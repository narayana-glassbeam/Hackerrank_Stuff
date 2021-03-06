//my solution passes only first 3 TCs, others fail due to timeout, will return to this challenge when I get better, this is expert level
object Solution {

    def main(args: Array[String]) {
        val n = readInt
        val words = new Array[String](n)
         for(i <- 0 until n) {
           words(i) =readLine
        }
        val q = readInt
        val queries = new Array[Int](q)
        for(i <- 0 until q) {
           queries(i) =readInt
        }

        val subs = setOfSubstrings(words)

        for(i <- 0 until q) {
           if(queries(i)>subs.length) println("INVALID")
           else (println(subs(queries(i)-1)))
        }

    }

    def setOfSubstrings(arr: Array[String]): List[String] = {
        def loop(arr: Array[String], list: List[String]): List[String] = {
            if (arr.isEmpty) list
            else loop(arr.tail, arr.head.inits.flatMap(_.tails.toList.init).toList++list)
        }
        loop(arr,List()).distinct.sorted
    }
}

/*You are given n strings w1, w2, ......, wn. Let Si denote the set of strings formed by considering all unique substrings of the string wi. A substring is defined as a contiguous sequence of one or more characters in the string. More information on substrings can be found here. Let S = {S1 U S2 U .... Sn} .i.e S is a set of strings formed by considering all the unique strings in all sets S1, S2, ..... Sn. You will be given many queries, and for each query, you will be given an integer 'k'. Your task is to display the lexicographically kth smallest string from the set S.

Input:

The first line of input contains a single integer n, denoting the number of strings. Each of the next n lines consists of a string. The string on the ith line (1<=i<=n) is denoted by wi and has a length mi. The next line consists of a single integer q, denoting the number of queries. Each of the next q lines consists of a single integer k.

Note: The input strings consist only of lowercase english alphabets 'a' - 'z'.

Output:

Output q lines, where the ith line consists of a string which is the answer to the ith query. If the input is invalid (i.e., k > size of S), display "INVALID" for that case.

Constraints:

1<= n <=50
1<= mi <=2000
1<= q <=500
1<= k <=1000000000

Sample Input:
2
aab
aac
3
3
8
23

Sample Output:
aab
c
INVALID

Explanation:

For the sample test case, we have 2 strings "aab" and "aac".
S1 = {"a", "aa", "aab", "ab", "b"} . These are the 5 unique substrings of "aab".
S2 = {"a", "aa", "aac",  "ac", "c" } . These are the 5 unique substrings of "aac".
Now, S = {S1 U S2} = {"a", "aa", "aab", "aac", "ab", "ac", "b", "c"}. Totally, 8 unique strings are present in the set S.
The lexicographically 3rd smallest string in S is "aab" and the lexicographically 8th smallest string in S is "c". Since there are only 8 distinct substrings, the answer to the last query is "INVALID".*/
