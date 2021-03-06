object Solution {
    def main(args: Array[String]) {
      val Array(n,m) = readLine.split(" ").map(_.toInt)
      val coins = readLine.split(" ").map(_.toInt)
      println(coinChangeCount(coins,n))

    }
    def coinChangeCount(coins: Array[Int], total: Int): Long = {
      val temp = Array.ofDim[Long](coins.length+1,total+1)
      for (i<- 0 to coins.length) {
        temp(i)(0)=1
      }
      for(i<-1 to coins.length) {
        for(j<- 1 to total) {
          if(coins(i-1)>j) temp(i)(j)=temp(i-1)(j)
          else temp(i)(j)=temp(i)(j-coins(i-1))+temp(i-1)(j)
        }
      }
      temp(coins.length)(total)
    }
}

//space efficient solution
object Solution {
    def main(args: Array[String]) {
      val Array(n,m) = readLine.split(" ").map(_.toInt)
      val coins = readLine.split(" ").map(_.toInt)
      println(coingChange(coins,n))
    }
    def coingChange(coins: Array[Int], total: Int): Long = {
      val temp: Array[Long] = new Array(total+1)
      temp(0)=1
      for(i<-0 until coins.length) {
        for(j<- 1 to total) {
          if(j>=coins(i)) temp(j)+=temp(j-coins(i))
        }
      }
      temp(total)
    }
}

/*How many different ways can you make change for an amount, given a list of coins? In this problem, your code will need to efficiently compute the answer.

Task

Write a program that, given

The amount NN to make change for and the number of types MM of infinitely available coins
A list of MM coins - C={C1,C2,C3,..,CM}C={C1,C2,C3,..,CM}
Prints out how many different ways you can make change from the coins to STDOUT.

The problem can be formally stated:

Given a value NN, if we want to make change for NN cents, and we have infinite supply of each of C={C1,C2,…,CM}C={C1,C2,…,CM} valued coins, how many ways can we make the change? The order of coins doesn’t matter.

Constraints

1≤Ci≤501≤Ci≤50
1≤N≤2501≤N≤250
1≤M≤501≤M≤50
The list of coins will contain distinct integers.
Solving the overlapping subproblems using dynamic programming

You can solve this problem recursively, but not all the tests will pass unless you optimise your solution to eliminate the overlapping subproblems using a dynamic programming solution

Or more specifically;

If you can think of a way to store the checked solutions, then this store can be used to avoid checking the same solution again and again.
Input Format

First line will contain 2 integer N and M respectively.
Second line contain M integer that represent list of distinct coins that are available in infinite amount.

Output Format

One integer which is the number of ways in which we can get a sum of N from the given infinite supply of M types of coins.*/
