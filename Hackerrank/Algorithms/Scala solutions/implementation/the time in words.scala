object Solution {

    def main(args: Array[String]) {
        val h = readInt
        val m = readInt

        val words = Map(
            0 -> "",
            1 -> "one",
            2 -> "two",
            3 -> "three",
            4 -> "four",
            5 -> "five",
            6 -> "six",
            7 -> "seven",
            8 -> "eight",
            9 -> "nine",
            10 -> "ten",
            11 -> "eleven",
            12 -> "twelve",
            13 -> "thirteen",
            14 -> "fourteen",
            15 -> "fifteen",
            16 -> "sixteen",
            17 -> "seventeen",
            18 -> "eighteen",
            19 -> "nineteen",
            20 -> "twenty",
            30 -> "thirty",
            40 -> "forty",
            50 -> "fifty"
        )
            m match {
            case 0 => println(s"${words(h)} o' clock")
            case 1 => println(s"one minute past ${words(h)}")
            case 30 => println(s"half past ${words(h)}")
            case 15 => println(s"quarter past ${words(h)}")
            case 45 => println(s"quarter to ${words(h+1)}")
            case less: Int if less < 30  => println(s"${words(m-m%10)} ${words(m%10)} minutes past ${words(h)}")
            case more: Int if more > 45 => println(s"${words(60-m)} minutes to ${words(h+1)}")
            case more: Int if more > 30 => println(s"${words(60-m-(m%10))} ${words(m%10)} minutes to ${words(h+1)}")
        }
    }
}

/*Given the time in numerals we may convert it into words, as shown below:

5:005:015:105:305:405:455:475:28→ five o' clock→ one minute past five→ ten minutes past five→ half past five→ twenty minutes to six→ quarter to six→ thirteen minutes to six→ twenty eight minutes past five
Write a program which prints the time in words for the input given in the format mentioned above.

Input Format

There will be two lines of input:
H, representing the hours
M, representing the minutes

Constraints
1≤H<12
0≤M<60
Output Format

Display the time in words.*/
