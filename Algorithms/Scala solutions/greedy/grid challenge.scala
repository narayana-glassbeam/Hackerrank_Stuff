object Solution {
    def main(args: Array[String]) {
       for (i <- 0 until readInt) {
           val n = readInt
           val arr = Array.fill(n)("")
           for (i <- 0 until n) {
               arr(i) = readLine.sorted
           }
           var go = true
           for (i <- 0 until n-1 if go) {
                for(j <- 0 until n if go) {
                    if(arr(i)(j)>arr(i+1)(j)) go = false
                }
           }
           println(if(go) "YES" else "NO")
       }
    }
}

//other solution
object Solution {

    def main(args: Array[String]) {
        (1 to readInt).foreach(_ => {
            val n = readInt
            val G = (1 to n).map(_ => readLine.sortWith(_ < _))
            val r = (0 to n - 1).forall(i => (0 to n - 2).forall(j => G(j)(i) <= G(j + 1)(i)))
            println(if (r) "YES" else "NO")
        })
    }
}

/*Given a squared sized grid GG of size NN in which each cell has a lowercase letter. Denote the character in the iith row and in the jjth column as G[i][j]G[i][j].

You can perform one operation as many times as you like: Swap two column adjacent characters in the same row G[i][j]G[i][j] and G[i][j+1]G[i][j+1] for all valid i,ji,j.

Is it possible to rearrange the grid such that the following condition is true?

G[i][1]≤G[i][2]≤⋯≤G[i][N]G[i][1]≤G[i][2]≤⋯≤G[i][N] for 1≤i≤N1≤i≤N and
G[1][j]≤G[2][j]≤⋯≤G[N][j]G[1][j]≤G[2][j]≤⋯≤G[N][j] for 1≤j≤N1≤j≤N
In other words, is it possible to rearrange the grid such that every row and every column is lexicographically sorted?

Note: c1≤c2c1≤c2, if letter c1c1 is equal to c2c2 or is before c2c2 in the alphabet.

Input Format

The first line begins with TT, the number of testcases. In each testcase you will be given NN. The following NN lines contain NN lowercase english alphabet each, describing the grid.

Output Format

Print TT lines. On the iith line print YES if it is possible to rearrange the grid in the iith testcase or NO otherwise.

Constraints
1≤T≤1001≤T≤100
1≤N≤1001≤N≤100
GijGij will be a lower case letter*/
