SumItUp=(n, k)=> {
    r=0,i=1
    while (i<=k) {
        r+=Array.from(new Array(n+1), (x,j) => j+i).reduce((a,b)=>a*b)
        i++
    }
    return r
}

/*
Let s(n, k) = sum[r * (r + 1) * (r + 2) * ... * (r + n)] where r runs from 1 to k.

Given n and k, your task is to find s(n,k).

Example

For n = 4 and k = 3, the output should be
SumItUp(n, k) = 3360.
*/
