function SumItUp(n, k) {
    var r = 0;
    for (var i = 1;i<=k;i++) {
        r+=Array.from(new Array(n+1), (x,j) => j+i).reduce((a,b)=>a*b)
    }
    return r;
}


/*
Let s(n, k) = sum[r * (r + 1) * (r + 2) * ... * (r + n)] where r runs from 1 to k.

Given n and k, your task is to find s(n,k).

Example

For n = 4 and k = 3, the output should be
SumItUp(n, k) = 3360.
*/
