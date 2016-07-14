object Solution {
    def main(args: Array[String]) {
       val s1 = readLine
       val s2 = readLine

       val c1 = new Array[Int](26)
       val c2 = new Array[Int](26)

       for (c <- s1) c1(c-'a')+=1
       for (c <- s2) c2(c-'a')+=1

       var result = 0
       for (i <- 0 to 25) {
           result += math.abs(c1(i)-c2(i))
       }
       println(result)
    }
}

//other solutions
object Solution {
    def main(args: Array[String]) {
        val A = readLine.toList
        val B = readLine.toList
        val diffs = for (c <- 'a' to 'z') yield math.abs(A.count(_ == c) - B.count(_ == c))
        println(diffs.sum)
    }
}

object Solution {
    def apply(a: Seq[Char], b: Seq[Char]): Int =
        a.size + b.size - ((a intersect b).size * 2)

    def main(args: Array[String]) {
        val a = readLine
        val b = readLine
        println(apply(a, b))
    }
}
