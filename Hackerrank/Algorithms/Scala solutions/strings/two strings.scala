object Solution {
    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            println(if(readLine.intersect(readLine).length > 0) "YES" else "NO")
        }
    }
}
//could have also used
readLine.intersect(readLine).isEmpty

//my other solution
object Solution {
    def main(args: Array[String]) {
        val letters = 'a' to 'z'

        for (_ <- 0 until readInt) {
            var fifo = false
            val s1 = readLine
            val s2 = readLine
            for (c <- letters if fifo==false) {
                if (s1.contains(c) && s2.contains(c)) fifo = true
            }
            println(if(fifo) "YES" else "NO")
        }
    }
}

//other solutions
object Solution {
    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        val cases = readInt
        for (x <- 0 until cases) {
            println(if (hasCommonSubString(readLine, readLine)) "YES" else "NO")
        }
    }

    def hasCommonSubString(s1: String, s2: String): Boolean = {
        val symbolCount1 = symbolCount(s1)
        val symbolCount2 = symbolCount(s2)

        for (x <- 0 until symbolCount1.length) {
            if (symbolCount1(x) > 0 && symbolCount2(x) > 0) return true
        }

        false
    }

    def symbolCount(s: String):Array[Int] = {
        val arr = new Array[Int](26)
        s.foreach(x => arr(x - 'a') += 1)
        arr
    }

}

/*You are given two strings, A and B. Find if there is a substring that appears in both A and B.

Input Format

Several test cases will be given to you in a single file. The first line of the input will contain a single integer T, the number of test cases.

Then there will be T descriptions of the test cases. Each description contains two lines. The first line contains the string A and the second line contains the string B.

Output Format

For each test case, display YES (in a newline), if there is a common substring. Otherwise, display NO.

Constraints

All the strings contain only lowercase Latin letters.
1<=T<=10
1<=|A|,|B|<=105*/
