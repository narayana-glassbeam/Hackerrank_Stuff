object Solution {
    def main(args: Array[String]) {
        val Array(n,k) = readLine.split(" ").map(_.toInt)
        val prices = readLine.split(" ").map(_.toInt).sorted
        var go = true
        var money = 0
        for (i <- 0 until n if go) {
            money+= prices(i)
            if (money>k) {
                go = false
                println(i)
            }
        }
    }
}

//similar solution
object Solution {
  def main(args: Array[String]): Unit = {
    val Array(n, k) = readLine().split(" ").map(_.toInt)
    val ns = readLine().split(" ").map(_.toInt).sorted
    var spent = 0
    var i = 0
    for (cost <- ns) {
      if (spent + cost <= k) {
        spent += cost
        i += 1
      }
    }
    println(i)
  }
}

/*Mark and Jane are very happy after having their first kid. Their son is very fond of toys, so Mark wants to buy some. There are NN different toys lying in front of him, tagged with their prices, but he has only $K$K. He wants to maximize the number of toys he buys with this money.

Now, you are Mark's best friend and have to help him buy as many toys as possible.

Input Format
The first line contains two integers, NN and KK, followed by a line containing NN space separated integers indicating the products' prices.

Output Format
An integer that denotes maximum number of toys Mark can buy for his son.

Constraints
1<=N<=1051<=N<=105
1<=K<=1091<=K<=109
1<=price of any toy<=1091<=price of any toy<=109
A toy can't be bought multiple times.*/
