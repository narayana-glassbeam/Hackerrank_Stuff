object HelloWorld {
    def main(args: Array[String]) {
        val input = readInt
        println(countZeros(factorial(input).toString));
    }

    def factorial(x: Int): BigInt = {
      @annotation.tailrec
      def loop(curr: BigInt, x: Int): BigInt = {
        if(x==1) curr
        else loop(curr*x, x-1)
      }
      loop(x,x-1)
    }

    def countZeros(s: String): Int = {
      var count = 0
      var go = true
      for (i <- s.length-1 to 0 by -1 if go) {
        if(s(i)=='0') count+=1
        else go = false
      }
      count
    }
}

/*Given a number find the number of trailing zeroes in its factorial.

Input Format

A single integer - N

Output Format

Print a single integer which is the number of trailing zeroes.

Input Constraints

1 <= N <= 1000*/
