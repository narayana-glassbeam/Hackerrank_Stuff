//note I had to code in Scala 2.9.2 unfortunately
object HelloWorld {
    def main(args: Array[String]) {
        for (num <- 1 to readInt) {
            val Array(l,p,c) = readLine.split(" ").map(_.toInt)
            var full = l*c
            if(full>=p) println("Case #%d: 0".format(num))
            else {
                println("Case #%d: %d".format(num, p/full))
            }
        }
    }
}

/*
Now that you have won Code Monk and been hired by HackerEarth as a software engineer, you have been assigned to work on their wildly popular programming contest website.

HackerEarth is expecting a lot of participants (P) in Code Monk next year, and they want to make sure that the site can support that many people at the same time. During Code Monk 2014 you learned that the site could support at least L people at a time without any errors, but you also know that the site can't yet support P people.

To determine how many more machines you'll need, you want to know within a factor of C how many people the site can support. This means that there is an integer a such that you know the site can support a people, but you know the site can't support a * C people.

You can run a test series of Think a Thon, each of which will determine whether the site can support at least X people for some integer value of X that you choose. If you pick an optimal strategy, choosing what tests to run based on the results of previous tests, how many Think a Thon do you need in the worst case?

Input

The first line of the input gives the number of test cases, T. T lines follow, each of which contains space-separated integers L, P and C in that order.

Output

For each test case, output one line containing "Case #x: y", where x is the case number (starting from 1) and y is the number of load tests you need to run in the worst case before knowing within a factor of C how many people the site can support.

CONSTRAINTS

1 ≤ T ≤ 1000.

2 ≤ C ≤ 10.

L, P and C are all integers.
*/

1 ≤ L < P ≤ 109.
