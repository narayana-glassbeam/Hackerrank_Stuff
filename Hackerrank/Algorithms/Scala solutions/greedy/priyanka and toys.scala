//recursive solution
object Solution {
    def main(args: Array[String]) {
       val n = readInt
       val toys = readLine.split(" ").map(_.toInt).sorted
       println(getToys(toys))
    }
    def getToys(arr: Array[Int]): Int = {
        @annotation.tailrec
        def loop(arr: Array[Int], count: Int): Int = {
            if(arr.length==0) count
            else {
                val less = arr.filter(_<=arr(0)+4)
                val more = arr.filter(_>arr(0)+4)
                if(less.length!=0) loop(more,count+1)
                else loop(more,count)
            }
        }
        loop(arr,0)
    }
}

//my other solution using only for loop and an array
object Solution {
    def main(args: Array[String]) {
       val n = readInt
       val toys = readLine.split(" ").map(_.toInt)
       val range = Array.fill(10001)(0)
       for(e <- toys) range(e)+=1
       var count = 0
       for(i <- 0 until 10001) {
           if (range(i)!=0) {
               count+=1
               for (j <- 0 to 4) {
                   range(i+j)=0
               }
           }
       }
       println(count)
    }
}

//other solutions
object Solution {
  def readInts = readLine().split(" ").map(_.toInt)

  def main(args: Array[String]) {
    val n = readInt()
    val w = readInts.sorted
    var cnt = 0
    var last = -1

    w.foreach { cur =>
      if(cur > last) {
        cnt += 1
        last = cur + 4
      }
    }
    println(cnt)
  }
}

/*
Little Priyanka visited a kids' shop. There are NN toys and their weight is represented by an array W=[w1,w2,…,wN]W=[w1,w2,…,wN]. Each toy costs 1 unit, and if she buys a toy with weight w′w′, then she can get all other toys whose weight lies between [w′,w′+4][w′,w′+4] (both inclusive) free of cost.

Input Format

The first line contains an integer NN i.e. number of toys.
Next line will contain NN integers, w1,w2,…,wNw1,w2,…,wN, representing the weight array.

Output Format

Minimum units with which Priyanka could buy all of toys.

Constraints
1≤N≤1051≤N≤105
0≤wi≤104,where i∈[1,N]

*/
