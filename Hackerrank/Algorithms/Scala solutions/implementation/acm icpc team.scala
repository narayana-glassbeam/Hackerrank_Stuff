//brute force way
object Solution {
    def main(args: Array[String]) {
        val Array(n, m) = readLine.split(" ").map(_.toInt);
        val topic = new Array[String](n)

        for(i <- 0 until n) {
           topic(i) =readLine
        }
        var count = 0
        var max = 0
        for (i <- 0 until n) {
            for (j <- i+1 until n) {
                val currentCount = findOneCount(topic(i),topic(j))
                if (currentCount > max) {
                    max = currentCount
                    count = 1
                }
                else if (currentCount==max) count += 1
            }
        }
        println(max)
        println(count)
    }
   def findOneCount(s1: String, s2: String): Int = {
        var count = 0
        for (i <- 0 until s1.length) if(s1(i)=='1' || s2(i)=='1') count+=1
        count
    }
}

//bitCount solution
object Solution {
    def main(args: Array[String]) {
        val Array(n, m) = readLine.split(" ").map(_.toInt);
        val topic = Array.fill(n)(BigInt(readLine(), 2))
        var count = 0
        var max = 0

        for (i <- 0 until n) {
            for (j <- i+1 until n) {
                val currentCount = (topic(i) | topic(j)).bitCount
                if (currentCount > max) {
                    max = currentCount
                    count = 1
                }
                else if (currentCount == max) count += 1
            }
        }
        println(max)
        println(count)
    }
}

//count methods
 def countOne(number: Int): Int = {
        var count = 0
        var num = number
        while (num > 0) {
            if(num%2==1) count+=1
            num = num / 2
        }
        count
    }

def countOne(number: BigInt): Int = {
        var count = 0
        var num = number
        while (num > 0) {
            count+=1
            num = num & num-1
        }
        count
    }


/*Problem Statement

You are given a list of N people who are attending ACM-ICPC World Finals. Each of them are either well versed in a topic or they are not. Find out the maximum number of topics a 2-person team can know. And also find out how many teams can know that maximum number of topics.

Note Suppose a, b, and c are three different people, then (a,b) and (b,c) are counted as two different teams.

Input Format

The first line contains two integers, N and M, separated by a single space, where N represents the number of people, and M represents the number of topics. N lines follow.
Each line contains a binary string of length M. If the ith line's jth character is 1, then the ith person knows the jth topic; otherwise, he doesn't know the topic.

Constraints
2≤N≤500
1≤M≤500

Output Format

On the first line, print the maximum number of topics a 2-person team can know.
On the second line, print the number of 2-person teams that can know the maximum number of topics.*/
