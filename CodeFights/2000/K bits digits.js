kBitsDigits=(n, k)=> {
   if (k==0) return [0]
   i=l=1,a=[]
   while (l<=n) {
     if(((i>>> 0).toString(2).match(/1/g)).length==k) a.push(i)
     i++
     l=(i>>> 0).toString(2).length
    }
    return a
}

/*Return a list of all numbers that have no more than n bits, such that exactly k of them are set to 1.

Example

For n = 4 and k = 1, the output should be
kBitsDigits(n, k) = [1,2,4,8].

110 = 12, which obviously has 1 < 4 number of bits, and the only bit is 1.
210 = 102, which has 2 < 4 number of bits, with the first one equal to 1.
410 = 1002, which has 3 < 4 number of bits, with the first one equal to 1.
810 = 102, which has 3 < 4 number of bits, with the first one equal to 1.

[input] integer n

The maximum number of bits the number can have, 1 ≤ n ≤ 20.

[input] integer k

The number of bits equal to 1, 0 ≤ k ≤ 20.

[output] array.integer

The numbers with at most n bits k of which are set to 1 sorted in ascending order.*/
