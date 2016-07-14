eulersTotient=n=>
{   r=n
    for (m=2; m*m<=n; m++)
    {
        if (n%m == 0)
        {
            while (n%m == 0)
                n/=m
            r-=r/m
        }
    }
     return n>1 ? r-= r/n : r
}


/*The Euler's totient of a positive integer n is the number of positive integers not greater than n that are relatively prime to n (i.e. their greatest common divisor equals 1).
In this challenge, your task is to write a function that computes the Euler's totient of a given number.

Example

eulersTotient(2) = 1
1 is the only number relatively prime to 2.
eulersTotient(1) = 1
1 is the only number relatively prime to 1.
eulersTotient(10) = 4
The following numbers are relatively prime to 10: 1, 3, 7 and 9.
[input] integer n

A positive integer, 1 ≤ n < 109.

[output] integer

Euler's totient of n.*/
