object Solution {
    def solution(N: Int): Int = {
        val n = N.toBinaryString
        val num = removeZeros(n)
        solve(num.toList,0,0)
    }

    def removeZeros(s: String) : String = {
        if(s.last!='0') s
        else removeZeros(s.dropRight(1))
    }

    def solve(list: List[Char], count: Int, max: Int): Int = {
        if (list.isEmpty) max
        else {
            if(list.head == '1') solve (list.tail, 0, if (count>max) count else max)
            else solve(list.tail, count+1, if (count>max) count else max)
        }
    }
}

//Link to the results
//https://codility.com/demo/results/training7D8D36-U6S/

/*A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.

Write a function:

object Solution { def solution(N: Int): Int }

that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.

Assume that:

N is an integer within the range [1..2,147,483,647].
Complexity:

expected worst-case time complexity is O(log(N));
expected worst-case space complexity is O(1).*/
