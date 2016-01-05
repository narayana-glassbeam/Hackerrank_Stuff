object Solution {
    def main(args: Array[String]) {
        val word = readLine.toList
        println(solve(word))
    }

    def solve(list: List[Char]): String = {
        @annotation.tailrec
        def loop(list: List[Char], newList: List[Char]): String = list match {
            case h::t => if (newList.contains(h)) loop(t, newList) else loop(t,h::newList)
            case _ => newList.mkString.reverse
        }
        loop(list, List())
    }
}

/*Problem Statement

Given a string, str= "s1s2…sn", consisting of n lower case latin characters ('a'-'z'), remove all of the characters that occurred previously in the string. That is, remove all characters, si, for which
∃j,sj=si and j<i
Input Format

Input will contain a string str of length n.

Output Format

Print the string after removing all characters that occurred previously.

Constraints
- 1≤n≤105
- si∈{′a′, ′b′,…, ′z′},where 1≤i≤n
Sample Input #00*/

//of course we could have just used
word.distinct
//but this is a recursion exercise :)
