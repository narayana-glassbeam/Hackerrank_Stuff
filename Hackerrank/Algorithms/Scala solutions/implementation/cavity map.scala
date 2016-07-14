object Solution {
    def main(args: Array[String]) {
        val N = readInt
        var arr = Array.ofDim[Char](N,N)
        for (i <- 0 until N) {
            arr(i) = readLine.toArray
        }
        for (i <- 0 until N) {
            if(i == 0 || i == N-1) println(arr(i).mkString)
            else {
                for (j <- 0 until N) {
                    if (j==0 || j==N-1) print(arr(i)(j))
                    else if(arr(i)(j)>arr(i-1)(j) && arr(i)(j)>arr(i+1)(j) && arr(i)(j)>arr(i)(j-1) && arr(i)(j)>arr(i)(j+1))
                        print('X')
                    else print(arr(i)(j))
                }
                println()
            }
        }
    }
}

/*Problem Statement

You are given a square map of size n×n. Each cell of the map has a value denoting its depth. We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side (edge).

You need to find all the cavities on the map and depict them with the uppercase character X.

Input Format

The first line contains an integer, n, denoting the size of the map. Each of the following n lines contains n positive digits without spaces. Each digit (1-9) denotes the depth of the appropriate area.

Constraints
1≤n≤100
Output Format

Output n lines, denoting the resulting map. Each cavity should be replaced with character X.*/
