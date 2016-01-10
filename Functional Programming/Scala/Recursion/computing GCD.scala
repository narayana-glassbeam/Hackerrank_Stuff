object Solution {

    def gcd(x: Int, y: Int): Int =
   {
      // You only need to fill up this function
        // To return the value of the GCD of x and y
        if(x == y) x
        else if(x < y) gcd(y, x)
        else gcd(y, x - y)

   }


/**This part handles the input/output. Do not change or modify it **/
  def acceptInputAndComputeGCD(pair:List[Int]) = {
      println(gcd(pair.head,pair.reverse.head))
  }

    def main(args: Array[String]) {
/** The part relates to the input/output. Do not change or modify it **/
         acceptInputAndComputeGCD(readLine().trim().split(" ").map(x=>x.toInt).toList)

    }
}

//other way
     def gcd(x: Int, y: Int): Int =
   {
       if(y == 0) x
       else gcd(y, x%y);
   }

/*
Problem Statement

The Euclidean Technique for Computing the GCD of two integers

Given two integers 'x' and 'y' a recursive technique to find their GCD is the Euclidean Algorithm.

This Algorithm tells us that, for computing the GCD of two positive integers x and y, if x and y are equal, GCD(x,y) = x, otherwise GCD(x,y) = GCD(x-y,y) if x > y. There are a few optimizations that can be made to the above logic, to arrive at a more efficient implementation.

Given the starter code, you need to complete a function body which returns the GCD of two integers 'x' and 'y' which will be provided to you.*/
