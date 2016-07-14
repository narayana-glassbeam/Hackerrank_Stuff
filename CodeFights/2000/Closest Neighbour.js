//please note that we had to have as less chars as possible so the solution is pretty shortened
function closestNeighbor(a) {
    var s = a.sort((a,b)=>a-b),d=i=0,n,c
    while(i<a.length) {
         c = Math.min((s[i]-s[i-1]) || 99, (s[i+1]-s[i]) || 99)
         if(c>d) {
              d=c
              n=s[i]
         }
        i++
    }
    return n
}


/*You're given a list of positive integers li. Let's call li[j] the ​closest numeric neighbor​ of li[i], if the absolute difference between li[i] and li[j] is the smallest among all valid j != i.

Your task is to find the element of li whose absolute difference with its ​closest numeric neighbor​ is the greatest. If there are several possible answers, return the smallest one.

Example

For li = [2,3,4,4,11,5,1,9], the output should be
FurthestNumber(li) = 9.*/
