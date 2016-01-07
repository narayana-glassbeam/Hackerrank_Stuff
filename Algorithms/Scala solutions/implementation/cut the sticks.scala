object Solution {
    def main(args: Array[String]) {
       val T = readInt
       var sticks = readLine.split(' ').toList.map(_.toInt)
       while(sticks.size > 0) {
           println(sticks.size)
           sticks = sticks.map(_-sticks.min).filter(_>0)
       }
    }
}



//same thing, but this one doesnt use var keyword
 def main(args: Array[String]) {
        val list = readLine.split(' ').toList.map(_.toInt)
        def cut(ls: List[Int]): Unit = if(ls.size > 0) {
            println(ls.size)
            cut(ls.map(_ - ls.min).filter(_ > 0))
        }
        cut(list)
    }

//this is the awsome solution, no need to subtract just cut the smallest
object Solution {

    def cut(sticks: List[Int]): Unit = if (sticks.length != 0){
        println(sticks.length)
        val min = sticks.min
        val newSticks = sticks.filter(_ > min)
        cut(newSticks)
    }

    def main(args: Array[String]) {
        val numSticks = readInt()
        val sticks = readLine.split(" ").map(_.toInt)
        cut(sticks.toList)
    }
}


/*Problem Statement

You are given N sticks, where the length of each stick is a positive integer. A cut operation is performed on the sticks such that all of them are reduced by the length of the smallest stick.

Suppose we have six sticks of the following lengths:
5 4 4 2 2 8

Then, in one cut operation we make a cut of length 2 from each of the six sticks. For the next cut operation four sticks are left (of non-zero length), whose lengths are the following:
3 2 2 6

The above step is repeated until no sticks are left.

Given the length of N sticks, print the number of sticks that are left before each subsequent cut operations.

Note: For each cut operation, you have to recalcuate the length of smallest sticks (excluding zero-length sticks).

Input Format
The first line contains a single integer N.
The next line contains N integers: a0, a1,...aN-1 separated by space, where ai represents the length of ith stick.

Output Format
For each operation, print the number of sticks that are cut, on separate lines.

Constraints
1 ≤ N ≤ 1000
1 ≤ ai ≤ 1000*/
