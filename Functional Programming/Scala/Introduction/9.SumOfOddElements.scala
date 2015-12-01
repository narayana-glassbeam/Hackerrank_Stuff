//turns out my first implementation is "fastest"
def f(arr:List[Int]):Int = {
    val list = arr.filter(_%2!=0)
    var num = 0
    for (i <- 0 until list.length) {
      num += list(i)
    }
    num
 }

//other solution
def f(arr:List[Int]):Int = arr match {
    case Nil => 0
    case h::t => (if(h%2==0)0 else h) + f(t)
 }

//thrid solution, lol didnt know there was a sum method :D
def f(arr: List[Int]) = arr.filter(_%2!=0).sum


/*Problem Statement

Return sum of odd elements from an list. The input and output portions will be handled automatically. You need to write a function with the recommended method signature.

Constraints
The list will have 1-100 elements. Each element will be an integer X such that -100<=X<=100.*/
