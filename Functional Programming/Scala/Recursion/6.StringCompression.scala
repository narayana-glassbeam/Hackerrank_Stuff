object Solution {
    def compress(s: String): String = {
        @annotation.tailrec
            def loop(acc: List[(Char, Int)], s: String): List[(Char, Int)] =  s match {
                case "" => acc
                case _  =>
                    val c = s(0)
                    val (first, rest) = s.span(_ == c)
                    loop((c, first.length) :: acc, rest)
        }
        loop(List[(Char, Int)](), s).reverse.map{case(c, n) => if(n == 1) s"$c" else s"$c$n"}.mkString("")
    }

    def main(args: Array[String]) {
        val msg = io.StdIn.readLine
        print(compress(msg))
    }
}
//just save the char, and how many times it is repeated (Char,Int) and pass the rest of the string


/*Problem Statement

Joseph and Javran are making a contest for the apes. During the process they have to communicate frequently with each other. Since they are not fully evolved as humans, they cannot speak properly. So they have to transfer messages using postcards of small sizes.
To save space on the small postcards, they devise a not-so-uncommon string compression algorithm:

If a character, ch, occurs n(>1) times in a row, then it will be represented by {ch}{n}, where {x} is the value of x. For example, if the substring is a sequence of 4 'a' ("aaaa"), it will be represented as "a4".

If a character, ch, occurs exactly one time in a row, then it will be simply represented as {ch}. For example, if the substring is "a", then it will be represented as "a".

Help Joseph to compress a message, msg, which will be sent to Javran.

Input
First, and only, line contains a string, msg, representing the message.

Output
Print the compressed message.

Constraints

1≤length(msg)≤105
msg consists of lowercase Latin characters ('a'-'z') only.*/
