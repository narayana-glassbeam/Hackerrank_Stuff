object Solution {
    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var arr = Array.ofDim[Int](6,6);
        for(i <- 0 to 5) {
           for(j <- 0 to 5){
              arr(i)(j) = sc.nextInt();
           }
        }
        var max = -100
        for(i <- 1 to 4) {
            for (j <- 1 to 4) {
                var res = arr(i-1)(j-1)+arr(i-1)(j)+arr(i-1)(j+1)+arr(i)(j)+arr(i+1)(j-1)+arr(i+1)(j)+arr(i+1)(j+1)
                if (max<res) max = res
            }
        }
        println(max)
    }
}

//other solution, interesting point how he read the lines
object Solution {
    def main(args: Array[String]) {
       val matrix = io.Source.stdin.getLines.map(_.split(" ").map(_.toInt).toArray).toArray
       var sum = -999999999
       for (i <- 0 to 3) {
         for (j <- 0 to 3) {
           var itemSum = matrix(i)(j) + matrix(i)(j+1) + matrix(i)(j+2) + matrix(i+1)(j+1) + matrix(i+2)(j) + matrix(i+2)(j+1) + matrix(i+2)(j+2)
           if (itemSum > sum) sum = itemSum
         }
       }
      println(sum)
    }
}

/*Problem Statement

You are given a 2D array with dimensions 6*6. An hourglass in an array is defined as a portion shaped like this:

a b c
  d
e f g
For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
Actually, there are many hourglasses in the array above. The three topmost hourglasses are the following:

1 1 1     1 1 0     1 0 0
  1         0         0
1 1 1     1 1 0     1 0 0
The sum of an hourglass is the sum of all the numbers within it. The sum for the hourglasses above are 7, 4, and 2, respectively.

In this problem, you have to print the largest sum among all the hourglasses in the array.

Note: If you have already solved the problem "Java 2D array" in the data structures chapter of the Java domain, you may skip this challenge.

Input Format

There will be exactly 6 lines of input, each containing 6 integers separated by spaces. Each integer will be between -9 and 9, inclusively.

Output Format

Print the answer to this problem on a single line.*/
