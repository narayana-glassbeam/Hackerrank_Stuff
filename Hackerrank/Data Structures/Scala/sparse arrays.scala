object Solution {
    def main(args: Array[String]) {
        val words = Array.fill(readInt)(readLine)
        val q = Array.fill(readInt)(readLine)
        for (c <- q) {
            println(words.filter(word => word==c).length)
        }
    }
}

/*Problem Statement

There are N strings. Each string's length is no more than 20 characters. There are also Q queries. For each query, you are given a string, and you need to find out how many times this string occurred previously.

Input Format

The first line contains N, the number of strings.
The next N lines each contain a string.
The N+2nd line contains Q, the number of queries.
The following Q lines each contain a query string.

Constraints

1≤N≤1000
1≤Q≤1000
1≤ length of any string≤20*/
