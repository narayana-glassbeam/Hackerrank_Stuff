object Solution {
    def main(args: Array[String]) {
        val sentance = readLine.replaceAll(" ", "")
        val L = sentance.length
        var rows = math.floor(math.sqrt(L)).toInt
        val columns = math.ceil(math.sqrt(L)).toInt
        if(rows*columns < L) rows = columns
        val encrypt = Array.fill(columns)("")

        for (i <- 0 until L) {
            encrypt(i%columns) += sentance(i)
        }
        println(encrypt.mkString(" "))
    }
}

//my mutable array solution (for no special reason)
import scala.collection.mutable.ArrayBuffer
object Solution {
    def main(args: Array[String]) {
        val sentance = readLine.replaceAll(" ", "")
        val L = sentance.length
        var rows = math.floor(math.sqrt(L)).toInt
        val columns = math.ceil(math.sqrt(L)).toInt
        var encrypt = ArrayBuffer[String]()

        if(rows*columns < L)    rows = columns
        for (_ <- 0 until columns)  {
            encrypt += ""
        }
        for (i <- 0 until L) {
            encrypt(i%columns) += sentance(i)
        }
        println(encrypt.mkString(" "))
    }
}

//other solutions

//just print
object Solution {
    def main(args: Array[String]) {
        val input = readLine
        val length = input.length

        val rows = Math.round(Math.sqrt(length)).toInt
        val columns = Math.ceil(length.toDouble / rows.toDouble).toInt

        var i = 0
        while (i < columns) {
          var j = 0
            while (i + j < length) {
              print(input(i + j))
              j += columns
            }
          print(" ")
          i += 1
        }
    }
}

//transpose
object Solution {
  def main(args: Array[String]): Unit = {
    val plaintext = readLine()
    val cols = math.sqrt(plaintext.length).ceil.toInt
    println(plaintext.toArray.grouped(cols).toArray.transpose.map(_.mkString).mkString(" "))
  }
}

//collect
object Solution extends App {
    val data = readLine()
    val width = Math.ceil(Math.sqrt(data.size)).toInt
    val grouped = data.grouped(width).toList
    println(Range(0, width).map{i => grouped.collect{case el if el.size > i => el(i)}.mkString}.mkString(" "))
}

object Solution {
  def main(args: Array[String]) = {
    val word = readLine
    val width = ceil(sqrt(word.length)).toInt
    val height = ceil(word.length.toDouble / width).toInt

    println((for {
      i <- 0 until width
    } yield (0 until height).map(j => j * width + i).filter(_ < word.length).map(word).mkString).mkString(" "))
  }

}

/*An English text needs to be encrypted using the following encryption scheme.
First, the spaces are removed from the text. Let L be the length of this text.
Then, characters are written into a grid, whose rows and columns have the following constraints:

⌊L−−√⌋≤rows≤column≤⌈L−−√⌉, where ⌊x⌋ is floor function and ⌈x⌉ is ceil function
For example, the sentence if man was meant to stay on the ground god would have given us roots after removing spaces is 54 characters long, so it is written in the form of a grid with 7 rows and 8 columns.

ifmanwas
meanttos
tayonthe
groundgo
dwouldha
vegivenu
sroots
Ensure that rows×columns≥L
If multiple grids satisfy the above conditions, choose the one with the minimum area, i.e. rows×columns.
The encoded message is obtained by displaying the characters in a column, inserting a space, and then displaying the next column and inserting a space, and so on. For example, the encoded message for the above rectangle is:

imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau

You will be given a message in English with no spaces between the words. The maximum message length can be 81 characters. Print the encoded message.*/
