object Solution {
    def main(args: Array[String]) {
        val wanted = readInt
        val size = readInt
        val arr = readLine.split(" ").map(_.toInt)
        println(getIndex(arr, wanted))
    }
    def getIndex(arr: Array[Int], wanted: Int): Int = {
        def loop(arr: Array[Int], wanted: Int, index: Int): Int = {
            if(wanted == arr(index)) index
            else loop(arr,wanted,index+1)
        }
        loop(arr,wanted,0)
    }
}

//could have just used
arr.indexOf(wanted)

/*This is a simple challenge to get things started. Given a sorted array (ar) and a number (V), can you print the index location of V in the array?

The next section describes the input format. You can often skip it, if you are using included methods.

Input Format
There will be three lines of input:

V - the value that has to be searched.
n - the size of the array.
ar - n numbers that make up the array.
Output Format
Output the index of V in the array.

The next section describes the constraints and ranges of the input. You should check this section to know the range of the input.

Constraints

1≤n≤1000
−1000≤V≤1000,V∈ar
It is guaranteed that V will occur in ar exactly once.
This "sample" shows the first input test case. It is often useful to go through the sample to understand a challenge.*/
