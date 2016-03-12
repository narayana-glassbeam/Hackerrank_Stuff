object Main extends App {
    var count = 0
    var sum = 0
    for (i <- 2 to Int.MaxValue if count < 1000) {
      var prime = true
      val limit = math.round(math.sqrt(i)).toInt
      for (j <- 2 to limit if prime) {
        if (i%j==0) {
          prime = false
        }
      }
      if(prime) {
        count+=1
        sum = sum + i
      }
    }
    println(sum)
}


/*SUM OF PRIMES
CHALLENGE DESCRIPTION:

Write a program which determines the sum of the first 1000 prime numbers.

INPUT SAMPLE:

There is no input for this program.

OUTPUT SAMPLE:

Print to stdout the sum of the first 1000 prime numbers.

3682913*/
