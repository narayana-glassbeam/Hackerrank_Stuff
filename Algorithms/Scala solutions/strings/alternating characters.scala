object Solution {
    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            println(deletions(readLine))
        }
    }
    def deletions(str:String): Int = {
        var counter = 0
        for (i <- 1 until str.length) {
            if(str(i)==str(i-1)) counter+=1
        }
        counter
    }
}


//other solutions
object Solution {
    def main(args: Array[String]) {
        val t = readLine.toInt
        for(i <- 1 to t){
            val s = readLine;
            println(s.size - s.replaceAll("A+", "A").replaceAll("B+", "B").size);
        }
    }
}
