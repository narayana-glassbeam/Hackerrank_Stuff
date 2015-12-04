object Solution {

     def fibonacci(x:Int):Int = {
      // Fill Up this function body
        @annotation.tailrec
         def go(x:Int, prev:Int, curr: Int):Int = {
             if (x==2) curr
             else go(x-1,curr,prev+curr)
         }
         go(x,0,1)
     }

    def main(args: Array[String]) {
         /** This will handle the input and output**/
         println(fibonacci(readInt()))

    }
}


/*Problem Statement

The Fibonacci Series

The Fibonacci series begins with 0 and 1 (which are the first and the second terms respectively). After this, every element is the sum of the preceding elements: i.e,

Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)
Given the starter code, complete the fibonacci function to return the Nth term.

Please note, that we start counting from Fibonacci(1) = 0. This might differ from some other notations which treat Fibonacci(0) = 0.

So overall equation is:

             = 0 , n = 1
Fibonacci(n) = 1 , n = 2
               Fibonacci(n-1) + Fibonacci(n-2)  , n > 2
*/.
