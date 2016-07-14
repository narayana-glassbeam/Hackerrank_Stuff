object Solution {

    def main(args: Array[String]) {
        var T = readInt
            while (T>0) {
            val tree = readInt
            println(solve(tree))
            T = T -1
        }
    }

    def solve(n: Int): Int = {
        if (n == 0) 1
            else {
             var tree = 1
             for(i <- 1 to n) {
                 if (i%2!=0) tree = tree * 2
                 else     tree = tree + 1
              }
        tree
        }
    }
}

/*Problem Statement

The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after N growth cycles?

Input Format

The first line contains an integer, T, the number of test cases.
T subsequent lines each contain an integer, N, denoting the number of cycles for that test case.

Constraints
1≤T≤10
0≤N≤60
Output Format

For each test case, print the height of the Utopian Tree after N cycles. Each height must be printed on a new line.*/
