object Solution {
    def main(args: Array[String]) = {
        val N = readInt
        var info = readLine.split(' ')
        var arr = new Array[String](N)
        for (i <- 0 until N) {
            arr(i) = readLine
        }

        val pPos = arr.mkString.indexOf('p')
        var vertical = info(0).toInt - pPos/N
        var horizontal = info(1).toInt - pPos%N

        if(vertical < 0)  println("DOWN")
        else if (vertical > 0)  println("UP")
        else {
            if(horizontal < 0)  println("RIGHT")
            else if (horizontal > 0) println("LEFT")
        }
    }
}

/*Problem Statement

In this version of "Bot saves princess", Princess Peach and bot's position are randomly set. Can you save the princess?

Task

Complete the function nextMove which takes in 4 parameters - an integer N, integers r and c indicating the row & column position of the bot and the character array grid - and outputs the next move the bot makes to rescue the princess.

Input Format

The first line of the input is N (<100), the size of the board (NxN). The second line of the input contains two space separated integers, which is the position of the bot.

Grid is indexed using Matrix Convention

The position of the princess is indicated by the character 'p' and the position of the bot is indicated by the character 'm' and each cell is denoted by '-' (ascii value: 45).

Output Format

Output only the next move you take to rescue the princess. Valid moves are LEFT, RIGHT, UP or DOWN*/
