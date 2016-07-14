object Solution {
    def main(args: Array[String]) {
        println(if(isPalAng(readLine)) "YES" else "NO")
    }
    def isPalAng(str: String): Boolean = {
        def loop(str:String, count: Int): Boolean = {
            if(count>1) false
            else if (str.isEmpty) true
            else {
                if(str.count(_==str(0))%2!=0) loop(str.filter(_!=str(0)), count+1)
                else loop(str.filter(_!=str(0)), count)
            }
        }
        loop(str,0)
    }
}

//amazing solution
object Solution {
    def main(args: Array[String]) {
        readLine match {
          case "" => println("Input too small")
          case line if line.size > 100000 => println("Input too big")
          case line if line.exists(p => p.isUpper) => println("Uppercase not allowed")
          case line =>
            val counts = line.distinct.map(c => line.count(_ == c))
            val hasPalindrome = counts.count(_ % 2 == 1) <= 1
            println(if (hasPalindrome) "YES" else "NO")
        }
    }
}

//can't get shorter
object Solution {
    def main(args: Array[String]) {
        println(if(readLine.groupBy(identity).values.filter(_.length%2!=0).size > 1) "NO" else "YES")
    }
}

object Solution {
  def main(args: Array[String]): Unit = {
    val s = readLine
    val chars = s.groupBy(c => c)
    if (chars.values.map(_.length).count(_ % 2 == 1) < 2) println("YES")
    else println("NO")
  }
}

object Solution {
    def main(args: Array[String]) {
        if (readLine.split("").drop(1).groupBy(identity).filter(_._2.length%2==1).size < 2)
            println("YES")
        else
            println("NO")
    }
}
