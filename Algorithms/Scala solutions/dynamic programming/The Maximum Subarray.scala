object Solution {
    def main(args: Array[String]) {
       for (_ <- 0 until readInt) {
           val n = readInt
           val arr = readLine.split(" ").map(_.toInt)
           var maxSum = 0
           var currSum = 0
           var positiveSum = 0
           var biggestNumber = Int.MinValue
           for (i <- 0 until n) {
               if (currSum <0) currSum = 0
               currSum += arr(i)
               if(currSum>maxSum) maxSum = currSum
               if (arr(i)>0)positiveSum+=arr(i)
               if(arr(i)>biggestNumber) biggestNumber=arr(i)
           }
           println(if(maxSum>0) s"${maxSum} ${positiveSum}" else s"${biggestNumber} ${biggestNumber}" )
       }
    }
}


/*Given an array A={a1,a2,…,aN}A={a1,a2,…,aN} of NN elements, find the maximum possible sum of a

Contiguous subarray
Non-contiguous (not necessarily contiguous) subarray.
Empty subarrays/subsequences should not be considered.

Input Format

First line of the input has an integer TT. TT cases follow.
Each test case begins with an integer NN. In the next line, NN integers follow representing the elements of array AA.

Constraints:

1≤T≤101≤T≤10
1≤N≤1051≤N≤105
−104≤ai≤104−104≤ai≤104
The subarray and subsequences you consider should have at least one element.

Output Format

Two, space separated, integers denoting the maximum contiguous and non-contiguous subarray. At least one integer should be selected and put into the subarrays (this may be required in cases where all elements are negative).*/
