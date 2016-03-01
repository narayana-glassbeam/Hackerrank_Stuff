//this one fail at last 3 cases with timeout
object Solution {
    def main(args: Array[String]) {
        val Array(n,k) = readLine.split(" ").map(_.toInt)
        val arr = readLine.split(" ").map(_.toInt)
        var curr = k
        for (i <- 0 until n if curr>0) {
            if(arr(i)!=n-i) {
                val temp = arr(i)
                val index = arr.indexWhere(_==n-i)
                arr(i)=n-i
                arr(index)=temp
                curr-=1
            }
        }
        println(arr.mkString(" "))

    }
}
//this one too
object Solution {
    def main(args: Array[String]) {
        val Array(n,k) = readLine.split(" ").map(_.toInt)
        val arr = readLine.trim.split(" ").map(_.toInt)
        println(permute(arr,k).mkString(" "))

    }
    def permute(arr: Array[Int], k: Int): Array[Int] = {
      @annotation.tailrec
      def loop (arr: Array[Int], k: Int, index: Int): Array[Int] = {
        if (k==0 || index>arr.length-1) arr
        else {
          val max = arr.max-index
          if(max != arr(index)) {
            val i = arr.indexWhere(_==max)
            val temp = arr(index)
            arr(index)=max
            arr(i)=temp
            loop(arr,k-1,index+1)
          } else {
            loop(arr,k,index+1)
          }
        }
      }
      loop(arr,k,0)
    }
}
