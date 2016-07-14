object Solution {
    def main(args: Array[String]) {
        val n = readInt
        val nums: Array[(Float,Float)] = Array.fill(n)((0,0))
        for (i <- 0 until n) {
            val Array(x,y) = readLine.split(" ").map(_.toFloat)
            nums(i) = (x,y)
        }
        var sum: Float = 0
        var j = n-1
        for (i <- 0 until n) {
          sum += compute(nums(j)_1,nums(i)_1,nums(j)_2,nums(i)_2)
          j = i
        }
        sum = math.abs(sum/2)
        println(f"$sum%1.1f")
    }
    def compute(x1: Float, y1: Float, x2: Float, y2: Float): Float = {
      return (x1*y2)-(y1*x2)
    }
}

/*You are given the cartesian coordinates of a set of points in a 2D2D plane. When traversed sequentially, these points form a Polygon, PP, which is not self-intersecting in nature. Can you compute the area of polygon PP?

Input Format

The first line contains an integer, NN, denoting the number of points.
The NN subsequent lines each contain 22 space-separated integers denoting the respective xx and yy coordinates of a point.

Constraints

No 22 points are coincident, and polygon PP is obtained by traversing the points in a clockwise direction.
4≤N≤10004≤N≤1000
0≤x,y≤10000≤x,y≤1000
Output Format

For each test case, print the area of PP (correct to a scale of one decimal place).

Note: Do not add any leading/trailing spaces or units; it is assumed that your result is in square units.*/
