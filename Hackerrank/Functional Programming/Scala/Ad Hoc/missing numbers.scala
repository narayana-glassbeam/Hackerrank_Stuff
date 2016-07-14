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
object Solution {
    def main(args: Array[String]) {
        val n = readInt
        val A = readLine.split(" ").map(_.toInt).toList
        val p = readInt
        val B = readLine.split(" ").map(_.toInt).toList
        println(B.diff(A).toSet.toList.sorted.mkString(" "))
    }
}

//another, very fast
object Solution {
    def main(args: Array[String]): Unit = {
        readLine()
        val a=readLine().split(' ').map(_.toInt)
        readLine()
        val b=readLine().split(' ').map(_.toInt)
        val m=b.min
        val z=new Array[Int](101)
        for(x<-a)z(x-m)-=1
        for(x<-b)z(x-m)+=1
        println( z.zipWithIndex.filter(_._1>0).map(_._2+m).mkString(" ") )
    }
}
