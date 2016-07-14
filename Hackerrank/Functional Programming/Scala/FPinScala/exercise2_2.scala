//Implement isSorted, which checks whether an Array[A] is sorted according to a given comparison function:

def isSorted[A](ar: Array[A], gt: (A,A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean = {
        if(n >= ar.length-1) true
        else if (gt(ar(n), ar(n+1))) false
        else go(n+1)
    }
    go(0)
}
