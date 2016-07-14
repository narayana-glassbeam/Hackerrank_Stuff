object Solution {
    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            val info = readLine.split(' ').map(_.toInt)
            val bought = info(0)/info(1)
            println(wrap(bought, bought, info(2)))
        }
    }
    @annotation.tailrec
    def wrap(choCount: Int, wrappers: Int, cost: Int): Int = {
        if(wrappers<cost) choCount
        else if (wrappers == cost) choCount+1
        else {
            wrap((wrappers/cost)+choCount,(wrappers/cost)+wrappers%cost,cost)
        }
    }
 }

/*Problem Statement

Little Bob loves chocolate, and he goes to a store with $N in his pocket. The price of each chocolate is $C. The store offers a discount: for every M wrappers he gives to the store, he gets one chocolate for free. How many chocolates does Bob get to eat?

Input Format:
The first line contains the number of test cases, T.
T lines follow, each of which contains three integers, N, C, and M.

Output Format:
Print the total number of chocolates Bob eats.

Constraints:
1≤T≤1000
2≤N≤105
1≤C≤N
2≤M≤N*/
