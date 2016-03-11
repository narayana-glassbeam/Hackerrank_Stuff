object HelloWorld {
    def main(args: Array[String]) {
        val n = readInt
        val arr = readLine.split(" ").map(_.toInt)
        var counter = 0
        for(i <- 0 until arr.length) {
          for(j <- 0 until arr.length if counter<2) {
            if(arr(i)%arr(j)==0) {
              counter+=1
            }
          }
          if(counter<2) print(arr(i)+" ")
          counter = 0
        }
    }
}

