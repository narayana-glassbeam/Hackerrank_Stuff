 def f(delim:Int,arr:List[Int]):List[Int] = {
     var list:List[Int] = Nil
     for (a <- arr)
        if(a < delim)
            list = list ::: List(a)
     list
 }

/*Problem Statement

Filter a given array of integers and leave only that values which are less than a specified value X. The integers in the output should be in the same sequence as they were in the input. You need to write a function with the recommended method signature for the languages mentioned below. For the rest of the languages you have to write complete code.

Input Format
The first line contains the delimiter X. This is followed by a list of integers, which represents the elements of list/array. You have to read input to the End-Of-File.

Output Format
Print integers in separate line from the array which are less than an upper-limit X in value. The sequence should be same as it was in the original array.

Constraints
1 <= size of array <= 100
For any element in the array, say Y, -100 <= Y <= 100
-100 <= X <= 100

Note
The purpose of this challenge is to learn how to write your own implementation of filter function. We recommend to not use the inbuilt library function.*/
