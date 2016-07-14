object Solution {
    def main(args: Array[String]) {
        for(_<- 0 until readInt) {
            var A:Map[Int,Int] = Map()
            var isFunction = true
            for (_ <- 0 until readInt) {
                val Array(x,y) = readLine.split(" ").map(_.toInt)
                if(!A.contains(x)) A+=(x->y)
                else {
                    if(A(x)!=y) isFunction = false
                }
            }
            println(if (isFunction) "YES" else "NO")
        }
    }
}

/*Objective
In this problem, we touch upon a basic concept that is fundamental to Functional Programming: identifying a relation which represents a valid function.

Task
You are given a set of unique (x,y)(x,y) ordered pairs constituting a relation. The xx-values form the domain, and the yy-values form the range to which they map. For each of these relations, identify whether they may possibly represent a valid function or not.

Note: You do not have to find the actual function, you just need to determine that the relation may be representative of some valid function.

Input Format

The first line contains an integer, TT, denoting the number of test cases. The subsequent lines describe TT test cases, and the input for each test case is as follows:

The first line contains an integer, NN, the number of (x,y)(x,y) pairs in the test case.
The NN subsequent lines each contain two space-separated integers describing the respective xx and yy values for each ordered pair.
Constraints

1≤T≤51≤T≤5
2≤2≤N≤100≤100
0≤x,y≤5000≤x,y≤500
x and y are both integers.x and y are both integers.
Output Format

On a new line for each test case, print YESYES if the set of ordered pairs represent a valid function, or NONO if they do not.*/
