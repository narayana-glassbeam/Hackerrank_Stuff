object Solution {
     def pascal(c: Int, r: Int): Int = {
        if(c == 0 ||  c == r) 1
            else pascal(c-1, r-1) + pascal(c, r - 1)
    }

    def main(args: Array[String]) {

        val N = readLine().trim().toInt
        for (row <- 0 to N-1) {
          for (col <- 0 to row)
            print(pascal(col, row) + " ")
          println()
    }
  }
}


/*Problem Statement

For a given integer K, print the first K rows of Pascal's Triangle. Print each row with values separated by spaces. The value at nthrow and rth column of the triangle is equal to n! / (r! * (n-r)!) where indexing start from 0. These values are the binomial coefficients.*/

//non recursive
def pas(n: Int, k: Int): Int = {
    fac(n) / (fac(k) * fac(n - k))
  }

val N = readLine().trim().toInt
        for (row <- 0 to N-1) {
          for (col <- 0 to row)
            print(pas(col, row) + " ")
          println()
