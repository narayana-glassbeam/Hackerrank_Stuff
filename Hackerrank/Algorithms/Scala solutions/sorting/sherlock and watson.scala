object Solution {
    def main(args: Array[String]) {
        val Array(n,k,q) = readLine.split(" ").map(_.toInt)
        val arr = readLine.split(" ").map(_.toInt)
        val kk = if(k>n)k%n else k
        val sol = arr.slice(arr.length-kk,arr.length)++arr.slice(0,arr.length-kk)
        for (_ <- 0 until q) {
            println(sol(readInt))
        }
    }
}

//nice solution
object Solution {
  def main(args: Array[String]) {
    val in = new Scanner(System.in)
    val n, k, q = in.nextInt
    val a = (0 until n).map(_ => in.nextInt)
    val ans = (0 until q).map(_ => in.nextInt).map(idx => a(((idx - k + 1L * n * k) % n).toInt)).mkString("\n")
    println(ans)
  }
}
//or just like this
for (i <- 1 to q) {
      val x = readInt()
      println(a(((x - k) % n + n) % n))
    }

/*John Watson performs an operation called Right Circular Rotation on an integer array [a[a00,a,a11,...a,...aN−1N−1]. Right Circular Rotation transforms the array from [a[a00,a,a11,...a,...aN−1N−1] to [a[aN−1N−1,a,a00,...,a,...,aN−2N−2].

He performs the operation KK times and tests Sherlock's ability to identify the element at a particular position in the array. He asks QQ queries. Each query consists of one integer, idxidx, for which you have to print the element at index idxidx in the rotated array, i.e. aaidxidx.

Input Format
The first line consists of three integers, NN, KK, and QQ,, separated by a single space.
The next line contains NN space-separated integers which indicate the elements of the array AA.
Each of the next QQ lines contains one integer per line denoting idxidx.

Output Format
For each query, print the value at index idxidx in the updated array separated by newline.*/
