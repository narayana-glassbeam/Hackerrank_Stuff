//first and longest solution, where we create 3 methods to suit our needs
def power(x: Float, exponent: Int): Float = {
    if(exponent == 0) 1
    else x*power(x,exponent-1)
}

def factorial(x: Int): Int = {
   if(x <= 1) 1
   else x*factorial(x-1)
}

def taylor(x: Float, term: Int): Float = {
    if (term==0) 1
    else (power(x, term)/factorial(term))+taylor(x,term-1)
}

def f(x: Float):Float=
  {
      taylor(x,9)
  }


//and here is the shorter solution, we use scala.math.pow for power and we create factorial function inside function f
def f(x: Float)=
  {
    def factorial(x: Int) = { (1 to x) product }
    (0 to 9).map(y => scala.math.pow(x, y) / factorial(y)).sum
  }





/*The series expansion of ex is given by:

1 + x + x2/2! + x3/3! + x4/4! + .......

Evaluate e^x for given values of x, by using the above expansion for the first 10 terms.

Input Format

The first line contains an integer number N which will be the number of test cases. N lines follow, each line containing a value of x for which you need to output the value of e^x using the above series expansion.These input values have exactly 4 decimal places each.

Output Format

N lines, each of them containing the value of e^x, computed by your program.

Constraints

1 <= N <= 50
-20.00 <= x <= 20.00
Var, Val in Scala; def and defn in Clojure are blocked keywords. The challenge is to accomplish this without either mutable state, or direct declaration of local variables.*/
