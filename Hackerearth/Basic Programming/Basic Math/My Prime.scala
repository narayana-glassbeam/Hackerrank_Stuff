object HelloWorld {
    def main(args: Array[String]) {
        val n = readInt
        val arr = readLine.split(" ").map(_.toInt)
        var counter = 0
        for(i <- 0 until arr.length) {
          for(j <- 0 until arr.length if counter<2) {
            if(arr(i)%arr(j)==0) {
              counter+=1
            }
          }
          if(counter<2) print(arr(i)+" ")
          counter = 0
        }
    }
}

/*
Recently you invented a brand-new definition of prime numbers. For a given set of positive integers S let's call X a prime if there are no elements in S which are divisors of X (except X itself).

You are given a set S. Find elements in it which are prime numbers for this set.

Input
The first line contains one integer N - size of the set S. The second line contains N space-separated integers - elements of S. All the numbers are pairwise different.

Output
Output one line: elements of S which are prime numbers for this set in the order they occur in the input. Separate them by whitespaces.

Constraints

N <= 100
1 <= S[i] <= 106 (1<=i<=n)
*/
