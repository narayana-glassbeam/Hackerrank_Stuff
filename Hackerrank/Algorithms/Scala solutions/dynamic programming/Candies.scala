object Solution {
    def main(args: Array[String]) {
        val n = readInt
        val kids = Array.fill(n)(0)
        for (i <- 0 until n) {
            kids(i)=readInt
        }
        println(candyCount(kids))
    }

    def candyCount(kids: Array[Int]): Int = {
      val len = kids.length;
      val tempF: Array[Int] = new Array(len)
      val tempB: Array[Int] = new Array(len)
      var sum = 0
      tempF(0)=1
      tempB(len-1)=1

      for (i <- 1 until len) {
        if(kids(i)>kids(i-1)) tempF(i)=tempF(i-1)+1
        else tempF(i)=1
        if(kids(len-i-1)>kids(len-i)) tempB(len-i-1)=tempB(len-i)+1
        else tempB(len-i-1)=1
      }
      for(i <- 0 until len) {
        if(tempB(i)>tempF(i)) sum+=tempB(i)
        else sum+=tempF(i)
      }
      sum
    }
}

//it's a little bit slower with this method to get the sum
sum = (0 until len).map(i => Math.max(tempF(i), tempB(i))).sum

/*Alice is a kindergarden teacher. She wants to give some candies to the children in her class.  All the children sit in a line ( their positions are fixed), and each  of them has a rating score according to his or her performance in the class.  Alice wants to give at least 1 candy to each child. If two children sit next to each other, then the one with the higher rating must get more candies. Alice wants to save money, so she needs to minimize the total number of candies given to the children.

Input Format

The first line of the input is an integer N, the number of children in Alice's class. Each of the following N lines contains an integer that indicates the rating of each child.

1 <= N <= 105
1 <= ratingi <= 105

Output Format

Output a single line containing the minimum number of candies Alice must buy.*/
