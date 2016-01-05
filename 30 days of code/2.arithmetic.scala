object Solution {

    def main(args: Array[String]) {
            val M = readDouble
            val T = readInt
            val X = readInt
            val tip = ((T*M)/100).toDouble
            val tax = ((X*M)/100).toDouble
            val finalPrice = math.round(M + tip + tax)
            println(s"The final price of the meal is $$$finalPrice.")
    }
}

/*Problem Statement

Welcome to Day 2! Check out the video tutorial here, or just jump right into the problem.

Practice how to do arithmetic with code in this challenge! If given the meal price, tip percentage, and tax percentage, we can find the final price of a meal.

In many of these challenges, you will need to read input from stdin (standard input) and write your output in stdout (standard output). Different programming languages provide different ways to handle input and output.

In Java, one way to take input from stdin is to use the Scanner class and read in from System.in. In other words, Java's Scanner class allows us to get information from the user/outside world by reading in from System.in.

In this problem, we read as input the original price of the meal, tip percentage, and tax percentage.

Good luck!

Input Format

Three numbers, (M, T, and X), each on separate lines:

M will be a double representing the original price of the meal.

T will be a integer representing the percentage that the customer wants to tip based off of the original price of the meal.

X will be an integer representing the tax percentage that the customer has to pay based off of the original price of the meal.

Output Format

A string stating...

The final price of the meal is $-.
where the final price of the meal is substituted for the dash. The price should be rounded to the nearest integer (dollar) - the code for rounding has already been added in the editor if you are coding in Java.*/
