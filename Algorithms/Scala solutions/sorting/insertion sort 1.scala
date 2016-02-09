object Solution {
    def main(args: Array[String]) {
        val size = readInt
        val arr = readLine.split(" ").map(_.toInt)
        val blackSheep = arr.last
        var go = true
        for (i <- size-2 to 0 by -1 if go) {
           if(arr(i)>blackSheep) {
               arr(i+1)= arr(i)
               arr.foreach(a => print(a+" "))
               if (i==0) {
                    arr(1)= arr(0)
                    arr(0)=blackSheep
                    println
                    arr.foreach(a => print(a+" "))
               }
           }
           else {
               arr(i+1)=blackSheep
               go = false
               arr.foreach(a => print(a+" "))
           }
           println
        }
    }
}
