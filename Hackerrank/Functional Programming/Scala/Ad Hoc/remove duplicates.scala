object Solution {
    def main(args: Array[String]) {
        println(readLine.distinct)
    }
}

//pretending distinct does not exist
object Solution {
    def main(args: Array[String]) {
        val word = readLine
        var dist = ""
        for (c <- word) {
            if (!dist.contains(c)) dist = dist + c
        }
        println(dist)
    }
}

/*You are given a string, str, of length N consisting of lowercase letters of alphabet. You have to remove all those characters from str which have already appeared in it, i.e., you have to keep only first occurance of each letter.

Input Format
First line of input contains a string str of length N.

Output Format
A string with removed characters as described in the problem.

Constraints
1 <= N <= 30000
str will contain only lowercase letters ('a'-'z').*/
