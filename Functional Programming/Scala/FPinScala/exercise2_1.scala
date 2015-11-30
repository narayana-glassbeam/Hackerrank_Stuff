    def fib(n: Int): Int = {
        @annotation.tailrec
        def go(n: Int, prev: Int, curr: Int): Int = {
            if (n == 0) prev
            else go(n-1, curr, prev+curr)
        }
    go(n, 0, 1)
    }

/*

Write a recursive function to get the nth Fibonacci number (http://mng.bz/C29s).
The first two Fibonacci numbers are 0 and 1.
The nth number is always the sum of the previous two—the sequence begins 0, 1, 1, 2, 3, 5.
Your definition should use a local tail-recursive function

*/


