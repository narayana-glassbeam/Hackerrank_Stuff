object Solution {
    def main(args: Array[String]) {
       val stupid = readInt
       val arr = readLine.split(" ").map(_.toLong).sorted
       for (_ <- 0 until readInt) {
           println(subsetSum(arr,readLong,0,arr.length-1))
       }
    }

  @annotation.tailrec
  def subsetSum(arr:Array[Long],sol:Long,sum:Long,i:Int) : Integer = {
      val curr = sum + arr(i)
      if(curr >= sol) return arr.length-i
      else if(i == 0) return -1
      else return subsetSum(arr,sol,curr,i-1)
    }
}
