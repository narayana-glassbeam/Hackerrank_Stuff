object Solution {
    def main(args: Array[String]) {
        val N = readInt
        (1 to N).foreach(i=> {
            println((" " * (N-i)) + ("#" * i))
        })
    }
}
