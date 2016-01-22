object Solution {
    def main(args: Array[String]) {
        val n = readInt
        val A = readLine.split(" ").map(_.toInt).toList
        val p = readInt
        val B = readLine.split(" ").map(_.toInt).toList
        solve(A,B).foreach(i=> print(i+" "))
    }
    def solve(small: List[Int], big: List[Int]): List[Int] = {
        def loop(small: List[Int], big: List[Int], list: List[Int]): List[Int] = {
            if (small.isEmpty) list
            else {
                if(small.count(_==small.head)<big.count(_==small.head)) loop(small.filter(_!=small.head), big, small.head::list)
                else loop(small.filter(_!=small.head), big, list)
            }
        }
        loop(small,big,List()).sorted
    }
}

//other solutions
