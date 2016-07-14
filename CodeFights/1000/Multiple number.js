MultipleNumber=n=>+n<10?+n:MultipleNumber(''+n.split("").reduce((a,b)=>+a*b))

/*Your task is to implement the following algorithm for the given n:

let x equal the product of digits in n;
n = x;
if n >= 10, goto 1;
return n.
Example

For n = "1234", the output should be
MultipleNumber(n) = 8.

1 * 2 * 3 * 4 = 24, and 2 * 4 = 8, thus the answer is 8.

Input/Output

[time limit] 4000ms (js)
[input] string n

A number given as a string.

Constraints:
0 ≤ n ≤ 1015.

[output] integer

The result the above-described algorithm will produce.*/
