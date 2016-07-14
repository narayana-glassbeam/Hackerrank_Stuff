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

//fully working solution
object Solution {
    def main(args: Array[String]) {
        val Array(n,k) = readLine.split(" ").map(_.toInt)
        val arrA = readLine.split(" ").map(_.toInt)
        val arrB = Array.fill(n + 1)(0)
        for(i <- arrA.indices) arrB(arrA(i)) = i
        var curr = k
        for (i <- 0 until n if curr>0) {
            if(arrA(i)<n-i) {
                arrA(arrB(n - i)) = arrA(i)
                arrB(arrA(i)) = arrB(n - i)
                arrA(i) = n - i
                arrB(n - i) = i
                curr -= 1
            }
        }
        println(arrA.mkString(" "))
    }
}

/*You are given an array of NN integers which is a permutation of the first NN natural numbers. You can swap any two elements of the array. You can make at most KK swaps. What is the largest permutation, in numerical order, you can make?

Input Format
The first line of the input contains two integers, NN and KK, the size of the input array and the maximum swaps you can make, respectively. The second line of the input contains a permutation of the first NN natural numbers.

Output Format
Print the lexicographically largest permutation you can make with at most KK swaps.

Constraints
1≤N≤1051≤N≤105
1≤K≤109*/
