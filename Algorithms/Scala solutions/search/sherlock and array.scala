object Solution {
    def main(args: Array[String]) {
        for(_ <- 0 until readInt) {
            val n = readInt
            val arr = readLine.split(" ").map(_.toInt)
            if (n==1) println("YES")
            else if (n==2) println("NO")
            else {
                var left = arr(0)
                var right = arr.slice(2,n).sum
                var go = true
                for (i <- 1 until n-1 if go) {
                    if (left==right) {
                        go = false
                    }
                    left += arr(i)
                    right -= arr(i+1)
                }
                println(if(go) "NO" else "YES")
            }
        }
    }
}

/*Watson gives Sherlock an array AA of length NN. Then he asks him to determine if there exists an element in the array such that the sum of the elements on its left is equal to the sum of the elements on its right. If there are no elements to the left/right, then the sum is considered to be zero.
Formally, find an ii, such that, AA1+A+A2...A...Ai-1 =A=Ai+1+A+Ai+2...A...AN.

Input Format
The first line contains TT, the number of test cases. For each test case, the first line contains NN, the number of elements in the array AA. The second line for each test case contains NN space-separated integers, denoting the array AA.

Output Format
For each test case print YES if there exists an element in the array, such that the sum of the elements on its left is equal to the sum of the elements on its right; otherwise print NO.

Constraints
1≤T≤101≤T≤10
1≤N≤1051≤N≤105
1≤A1≤Ai ≤2×104≤2×104
1≤i≤N*/
