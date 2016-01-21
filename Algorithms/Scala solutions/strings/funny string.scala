object Solution {
    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            println(if(isFunny(readLine)) "Funny" else "Not Funny")
        }
    }
    def isFunny(str: String): Boolean = {
        val length = str.length-1
        for (i <- 0 until length/2) {
            if(math.abs(str(i).toInt-str(i+1).toInt)!=math.abs(str(length-i).toInt-str(length-(i+1)).toInt)) return false
        }
        true
    }
}

//other solutions
object Solution {
    def main(args: Array[String]) {
        val t = readInt()
        println(Range(0, t).map{ _ =>
          val s = readLine().toArray
          val r = s.reverse.toArray
          if (Range(1, s.size).forall{ i => Math.abs(s(i) - s(i - 1)) == Math.abs(r(i) - r(i - 1)) }) {
            "Funny"
          } else "Not Funny"
        }.mkString("\n"))
    }
}

object Solution {
  import scala.io.StdIn._

  def main(args: Array[String]) {
    for (_ <- 1 to readInt()) {
      val funny = isStringFunny(readLine())
      println(if (funny) "Funny" else "Not Funny")
    }
  }
  def isStringFunny(s: String) = {
    val n = s.size
    def charDiff(i: Int) = math.abs(s(i) - s(i - 1))
    def isCharFunny(i: Int) = charDiff(i) == charDiff(n - i)
    (1 until n) forall isCharFunny
  }
}

object Solution {
    def main(args: Array[String]) {
        (0 until readInt).foreach(_=>{
            val s = readLine
            if ((1 until s.length).forall(i=>{
                math.abs(s(i)-s(i-1))==math.abs(s(s.length-i)-s(s.length-i-1))
            })) println("Funny") else println("Not Funny")
        })
    }
}
