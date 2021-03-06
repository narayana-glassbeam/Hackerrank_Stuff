object Solution {
    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            val colors = readLine.toList
            println(if (isFullOfColors(colors)) "True" else "False")
        }
    }
    def isFullOfColors(list: List[Char]): Boolean = {
        @annotation.tailrec
        def loop(list: List[Char], y: Int, g: Int, b: Int, r: Int): Boolean = {
            if(list.isEmpty) {r==g && b==y}
            else {
                val newY = if(list.head=='Y') y+1 else y
                val newG = if(list.head=='G') g+1 else g
                val newB = if(list.head=='B') b+1 else b
                val newR = if(list.head=='R') r+1 else r

                if(Math.abs(newR-newG)>1 || Math.abs(newB-newY)>1) false
                else loop(list.tail, newY, newG, newB, newR)
            }
        }
        loop(list,0,0,0,0)
    }
}

//very interesting, and faster solution
object Solution {
    def main(args: Array[String]) {
        for(i <- 1 to readInt){
            println(
                 SequenceFullOfColors(readLine)
            )
        }
    }
    def SequenceFullOfColors( casei:String):String={
        var r = 0
        var g = 0
        var y = 0
        var b = 0
        for(i <- casei){
            i match{
                case 'R' => r += 1
                case 'G' => g += 1
                case 'Y' => y += 1
                case 'B' => b += 1
            }

            if ( Math.abs(r-g)>1 || Math.abs(b-y) > 1)
                return "False"
        }

        if ( r == g && b == y  )
            "True"
        else
            "False"
    }
}

//using pattern matching, also cool
object Solution {

    def main(args: Array[String]) {
        for(_ <- 0 until readInt)
            if(isFullOfColors(readLine.toCharArray.toList, 0, 0, 0, 0))
                println("True")
            else
                println("False")
    }

    @annotation.tailrec
    def isFullOfColors(list:List[Char], r:Int, g:Int, y:Int, b:Int):Boolean = list match {
        case List() => return r == g && y == b
        case 'R'::tail => return r <= g && isFullOfColors(tail, r+1, g, y, b)
        case 'G'::tail => return g <= r && isFullOfColors(tail, r, g+1, y, b)
        case 'Y'::tail => return y <= b && isFullOfColors(tail, r, g, y+1, b)
        case 'B'::tail => return b <= y && isFullOfColors(tail, r, g, y, b+1)
        case _ => false
    }
}

/*Problem Statement

You are given a sequence of N balls in 4 colors: red, green, yellow and blue. The sequence is full of colors if and only if all of the following conditions are true:

There are as many red balls as green balls.
There are as many yellow balls as blue balls.
Difference between the number of red balls and green balls in every prefix of the sequence is at most 1.
Difference between the number of yellow balls and blue balls in every prefix of the sequence is at most 1.
Your task is to write a program, which for a given sequence prints True if it is full of colors, otherwise it prints False.

Input
In the first line there is one number T denoting the number of tests cases.
T lines follow. In each of them there is a sequence of letters {R,G,Y,B} denoting the input sequence (R - red, G - green, Y - yellow, B - blue).

Output
For each test case, print True if this is a sequence full of colors, otherwise print False.

Constraints
1≤T≤10
Sequence will only consists of letters {R,G,Y,B}.
Sum of length of all sequences will not exceed 106.

Notes
A prefix of a string T=t1…tn is a string Tˆ=t1…tm, where 0≤m≤n.*/
