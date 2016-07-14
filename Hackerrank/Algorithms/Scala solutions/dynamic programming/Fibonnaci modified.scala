//my recursive solution
object Solution {
    def main(args: Array[String]) {
        val Array(a,b,k) = readLine.split(" ").map(_.toInt)
        println(fib(a,b,k))
    }
    def fib(a: BigInt, b: BigInt, k: Int): BigInt = {
      @annotation.tailrec
      def loop(a: BigInt, b: BigInt, k: Int): BigInt = {
        val curr = a+b*b
        if(k==1) curr
        else loop (b,curr,k-1)
      }
      loop(a,b,k-2)
    }
}

//my DP solution
object Solution {
    def main(args: Array[String]) {
        val Array(a,b,k) = readLine.split(" ").map(_.toInt)
        val arr: Array[BigInt] = Array.fill(k)(0)
        arr(0)=a
        arr(1)=b
        for (i <- 2 until arr.length) {
          arr(i)=arr(i-1)*arr(i-1)+arr(i-2)
        }
        println(arr(k-1))
    }
}

/*A series is defined in the following manner:

Given the nth and (n+1)th terms, the (n+2)th can be computed by the following relation
Tn+2 = (Tn+1)2 + Tn

So, if the first two terms of the series are 0 and 1:
the third term = 12 + 0 = 1
fourth term = 12 + 1 = 2
fifth term = 22 + 1 = 5
... And so on.

Given three integers A, B and N, such that the first two terms of the series (1st and 2nd terms) are A and B respectively, compute the Nth term of the series.

Input Format

You are given three space separated integers A, B and N on one line.

Input Constraints
0 <= A,B <= 2
3 <= N <= 20

Output Format

One integer.
This integer is the Nth term of the given series when the first two terms are A and B respectively.

Note

Some output may even exceed the range of 64 bit integer.*/
