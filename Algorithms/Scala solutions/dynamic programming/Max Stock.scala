//not a DP solution, I'll try to find one later
object Solution {

    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            val n = readInt
            val shares = readLine.split(" ").map(_.toInt)
            val result = getProfit(shares)
            println(if(result>0) result else 0)
        }
    }

    def getProfit(shares: Array[Int]): Long = {
      var profit = 0L
      var sell = shares.length-1
      for(i <- sell-1 to 0 by -1) {
          if(shares(i)>=shares(sell)) sell=i
          else profit+=shares(sell)-shares(i)
      }
      profit
    }
}

/*Your algorithms have become so good at predicting the market that you now know what the share price of Wooden Orange Toothpicks Inc. (WOT) will be for the next N days.

Each day, you can either buy one share of WOT, sell any number of shares of WOT that you own, or not make any transaction at all. What is the maximum profit you can obtain with an optimum trading strategy?

Input

The first line contains the number of test cases T. T test cases follow:

The first line of each test case contains a number N. The next line contains N integers, denoting the predicted price of WOT shares for the next N days.

Output

Output T lines, containing the maximum profit which can be obtained for the corresponding test case.

Constraints

1 <= T <= 10
1 <= N <= 50000

All share prices are between 1 and 100000*/
