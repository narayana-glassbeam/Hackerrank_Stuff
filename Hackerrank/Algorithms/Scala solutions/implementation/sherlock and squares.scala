object Solution {
    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            val nums = readLine.split(' ').toList.map(_.toInt)
            println((Math.floor(Math.sqrt(nums.last))-Math.ceil(Math.sqrt(nums.head))+1).toInt)
        }
    }
}

/*Problem Statement

Watson gives two integers (A and B) to Sherlock and asks if he can count the number of square integers between A and B (both inclusive).

Note: A square integer is an integer which is the square of any integer. For example, 1, 4, 9, and 16 are some of the square integers as they are squares of 1, 2, 3, and 4, respectively.

Input Format
The first line contains T, the number of test cases. T test cases follow, each in a new line.
Each test case contains two space-separated integers denoting A and B.

Output Format
For each test case, print the required answer in a new line.

Constraints
1≤T≤100
1≤A≤B≤109*/


//brute force solution
println((nums.head to nums.last).filter(num => (Math.sqrt(num)%1==0)).length)
