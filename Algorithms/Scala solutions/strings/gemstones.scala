object Solution {
    def main(args: Array[String]) {
        val letters = Array.fill(26)(0)
        val N = readInt
        for (_ <- 0 until N) {
            val read = readLine.distinct.map(_.toInt-97)
            for (i <- 0 until read.size) {
                letters(read(i))+=1
            }
        }
        println(letters.filter(_==N).size)
    }
}

//other solutions

//masterful
object Solution {
  def main(args: Array[String]) = {
    val n = readInt
    val compositions = (1 to n).map(x => readLine)
    println(compositions.head.distinct.count(char => compositions.forall(_.contains(char))))
  }

}

object Solution {
  def parseGems(lines: List[String]) = lines.foldLeft(('a' to 'z') toSet)((a,b) => a intersect b.toSet)
  def main(args: Array[String]) = {
    System.out.println(parseGems(scala.io.Source.stdin.getLines.drop(1).toList).size)
  }
}

object Solution {
    def main(args: Array[String]) {
        val stone_nb = readInt
        var elements = readLine.toCharArray.distinct
        for (_ <- 0 until stone_nb-1) {
            val stone = readLine.toCharArray
            elements = elements.filter(c => stone.contains(c))
        }
        println(elements.size)
    }
}


object Solution {
  def main(args: Array[String]) = {
    val n = readLine().toInt
    val stones = for (_ <- 1 to n) yield readLine()
    println(('a' to 'z').filter(x => !stones.exists(!_.contains(x))).length)
  }
}

object Solution {
    def toSet(s:String):Set[Char] = {
        s.foldLeft(Set[Char]())(_+_)
    }
    def main(args:Array[String]):Unit = {
        val N:Int = readInt
        val S = (1 to N).map(_=>toSet(readLine))
        val r = S.reduce(_&_)
        println(r.size)
    }
}

object Solution{
    def main(args : Array[String]){
        val testCases = readInt()
        val result = (1 to testCases).toList.map(x => readLine().toSet).reduceLeft(_ & _).size
        println(result)

    }
}

object Solution {
  def main(args: Array[String]) {
    val input = io.Source.stdin.getLines().drop(1).toSeq
    println(solve(input))
  }

  def solve(rock: Seq[String]): Int = rock.map(_.toSet).reduce(_ intersect _).size
}

