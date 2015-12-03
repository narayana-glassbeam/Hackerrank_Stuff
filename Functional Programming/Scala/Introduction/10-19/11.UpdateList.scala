//solution one
def f(arr:List[Int]):List[Int] = arr.map((x)=> if(x<0)-x else x)

//solution two
def abs(n: Int): Int = if(n<0)-n else n
def f(arr:List[Int]):List[Int] = arr match {
    case h::Nil => abs(h)::Nil
    case h::t => abs(h)::f(t)
}


/*Problem Statement

Update the values of a list with their absolute values. The input and output portions will be handled automatically during grading. You only need to write a function with the recommended method signature.

Input Format
There are N integers, each on a new line. These are the N elements of the input array.

Output Format
N integers each on a new line; these are the absolute values of the input list, in that order.*/
