object Solution {

    def main(args: Array[String]) {
        val n = readInt
        val arr = Array.fill(n)(0)
        for (i <- 0 until n) {
            arr(i)= readLine.split(" ").map(_.toInt).sum
        }
        val sorted = arr.zipWithIndex.sortBy(_._1).map(_._2+1).mkString(" ")
        println(sorted)
    }
}
//my other solution
object Solution {
    def main(args: Array[String]) {
        val n = readInt
        var arr:Map[Int,Int] = Map()
        for (i <- 0 until n) {
            arr+=(i+1 -> readLine.split(" ").map(_.toInt).sum)
        }
        val sorted = arr.toList.sortBy(_._2)
        for(e <- sorted) print(e._1+" ")
    }
}

//similar
object Solution {
    def main(args: Array[String]) {
        val n = readInt
        val result = (1 to n)
            .map { _ => readLine.split(" ").map(_.toInt).reduce(_ + _) }
            .zipWithIndex
            .sortBy(_._1)
            .map(_._2 + 1)
            .mkString(" ")
        println(result)
    }
}

/*In Jim's Burger, nn hungry burger fans are ordering burgers. The iith order is placed by the iith fan at titi time and it takes didi time to process. What is the order in which the fans will get their burgers?

Input Format
On the first line you will get nn, the number of orders. Then nn lines will follow. On the (i+1)(i+1)th line, you will get titi and didi separated by a single space.

Output Format
Print the order ( as single space separated integers ) in which the burger fans get their burgers. If two fans get the burger at the same time, then print the smallest numbered order first.(remember, the fans are numbered 1 to nn).

Constraints
1≤n≤1031≤n≤103
1≤ti,di≤106*/
