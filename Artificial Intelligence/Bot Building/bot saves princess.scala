object Solution {
    def main(args: Array[String]) = {
        val N = readInt
        var arr = new Array[String](N)
        for (i <- 0 until N) {
            arr(i) = readLine
        }
        val mPos = arr.mkString.indexOf('m')
        val pPos = arr.mkString.indexOf('p')

        var vertical = mPos/N - pPos/N
        var horizontal = mPos%N - pPos%N

        if(vertical < 0) for(_ <- vertical until 0) println("DOWN")
        else for(_ <- 0 until vertical) println("UP")
        if(horizontal < 0) for(_ <- horizontal until 0) println("RIGHT")
        else for(_ <- 0 until horizontal) println("LEFT")
        }
}
