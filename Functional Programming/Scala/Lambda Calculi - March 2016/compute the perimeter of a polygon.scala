object Solution {
    def main(args: Array[String]) {
        val n = readInt
        val nums:Array[(Int, Int)] = Array.fill(n)((0,0))
        for (i <- 0 until n) {
            val Array(x,y) = readLine.split(" ").map(_.toInt)
            nums(i) = (x,y)
        }
        var sum = getDistance(nums(n-1)_1,nums(n-1)_2,nums(0)_1,nums(0)_2)
        for (i <- 0 until n-1) {
          sum+=getDistance(nums(i)_1,nums(i)_2,nums(i+1)_1,nums(i+1)_2)
        }
        println(f"$sum%1.7f")
    }
    def getDistance(x1: Int, y1: Int, x2: Int, y2: Int): Double = {
        return Math.hypot(x1-x2,y1-y2)
    }
}
