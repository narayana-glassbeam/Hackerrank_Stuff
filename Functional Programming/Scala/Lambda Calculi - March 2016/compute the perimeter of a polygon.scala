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

/*You are given the cartesian coordinates of a set of points in a 2D2D plane. When traversed sequentially, these points form a Polygon, PP, which is not self-intersecting in nature. Can you compute the perimeter of polygon PP?

Input Format

The first line contains an integer, NN, denoting the number of points.
The NN subsequent lines each contain 22 space-separated integers denoting the respective xx and yy coordinates of a point.

Constraints

No 22 points are coincident, and polygon PP is obtained by traversing the points in a clockwise direction.
3≤N≤10003≤N≤1000
0≤x,y≤10000≤x,y≤1000
Output Format

For each test case, print the perimeter of PP (correct to a scale of one decimal place).

Note: Do not add any leading/trailing spaces or units.*/
