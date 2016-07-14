object Solution {
    def main(args: Array[String]) {
        for(_ <- 0 until readInt) {
            println(readInt.toBinaryString)
        }
    }
}

//my implementation with list
object Solution {
    def main(args: Array[String]) {
        for(_ <- 0 until readInt) {
            println(toBinary(readInt, List()))
        }
    }
    def toBinary(n: Int, bits: List[Int]): String = n match {
       case 0 => bits.mkString
       case _ => toBinary(n/2,n%2::bits)
    }
}

//my implementation with stringBuilder
object Solution {
  def main(args: Array[String]) {
        for(_ <- 0 until readInt) {
            val bits = new StringBuilder()
            println(toBinary(readInt, bits))
        }
    }
    def toBinary(n: Int, bits: StringBuilder): String = n match {
       case 0 => bits.reverse.toString
       case _ => toBinary(n/2,bits.append(n%2))
    }
}
