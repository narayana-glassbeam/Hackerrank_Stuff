def f(arr:List[Int]):Int = arr match {
     case Nil => 0
     case h::t => 1 +f(t)

 }

/*Problem Statement

Count the number of elements in an array without using count, size or length operators (or their equivalents). The input and output portions will be handled automatically by the grader. You only need to write a function with the recommended method signature.

Input Format

A list with Integers; each integer is on a new line.

Output Format

A single integer N which is the length of the list which was provided as input.*/
