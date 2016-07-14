//my brute force
object Solution {
    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            val Array(first, second) = readLine.split(" ").map(_.toInt)
            val firstList = for (i <- 1 to first/2 if first%i==0) yield i
            val secondList = for (i <- 1 to second/2 if second%i==0) yield i
            println(if (first%second==0 || second%first==0)
                    firstList.filter(i=> secondList.contains(i)).size + 1 else firstList.filter(i=> secondList.contains(i)).size)
        }
    }
}

//just finding the GCD of the two numbers, and then its divisors
object Solution {
    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            val Array(first, second) = readLine.split(" ").map(_.toInt)
            val greatest = gcd(first, second)
            val list = for (i <- 1 to greatest/2 if greatest%i==0) yield i
            println(list.size+1)
        }
    }
    def gcd(x: Int, y: Int) : Int = {
        if (y==0) x
        else gcd(y, x%y)
      }
}
