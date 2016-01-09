object Solution {
    def main(args: Array[String]) {
        val info = readLine.split(' ')
        println(superDigit(info(0), info(1).toInt))
    }
     def superDigit(word: String, k: Int): Int = {
        if(word.length==1 && k == 0) word.toInt
        else if(word.length == 1 && k != 0) superDigit((k*word.toInt).toString,0)
        else superDigit(word.map(_.asDigit).toList.sum.toString, k)
    }
}

/*Problem Statement

We define super digit of an integer x using the following rules:

Iff x has only 1 digit, then its super digit is x.
Otherwise, the super digit of x is equal to the super digit of the digit-sum of x. Here, digit-sum of a number is defined as the sum of its digits.
For example, super digit of 9875 will be calculated as:

super-digit(9875) = super-digit(9+8+7+5)
                  = super-digit(29)
                  = super-digit(2+9)
                  = super-digit(11)
                  = super-digit(1+1)
                  = super-digit(2)
                  = 2.
You are given two numbers - n k. You have to calculate the super digit of P.

P is created when number n is concatenated k times. That is, if n = 123 and k = 3, then P = 123123123.

Input Format
Input will contain two space separated integers, n and k.

Output Format

Output the super digit of P, where P is created as described above.

Constraint

1≤n<10100000
1≤k≤105*/
