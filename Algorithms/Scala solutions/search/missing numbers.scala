object Solution {
    def main(args: Array[String]) {
        val n = readInt
        val first = readLine.split(" ").map(_.toInt)
        val m = readInt
        val second = readLine.split(" ").map(_.toInt)
        val distinct = second.distinct.sorted

        for (i <- 0 until distinct.length) {
            val f1 = first.count(_==distinct(i))
            val f2 = second.count(_==distinct(i))
            if (f1!=f2) print(distinct(i)+" ")
        }
    }
}

//other solution
object Solution {
    def main(args: Array[String]) {
        val n = readInt
        val first = readLine.split(" ").map(_.toInt)
        val m = readInt
        val second = readLine.split(" ").map(_.toInt)
        val f = Array.fill(101)(0)
        val min = second.min
        for (e <- first) f(e-min)-=1
        for (e <- second) f(e-min)+=1
        for(i<-0 until 101) {
            if(f(i)>0)print(i+min+" ")
        }
    }
}
//or just like this
println(f.zipWithIndex.filter(_._1>0).map(_._2+min).mkString(" "))

//other
object Solution {
    def main(args: Array[String]) {
        var n = readLine().toInt
        var l1 = readLine().split(" ").map(x=>x.toInt).toList
        var m = readLine().toInt
        var l2 = readLine().split(" ").map(x=>x.toInt).toList
        l2.diff(l1).sortWith(_ < _).distinct.foreach(k => print(k + " "))
    }
}

/*Numeros, the Artist, had two lists AA and BB, such that BB was a permutation of AA. Numeros was very proud of these lists. Unfortunately, while transporting them from one exhibition to another, some numbers were left out of AA. Can you find the missing numbers?

Notes

If a number occurs multiple times in the lists, you must ensure that the frequency of that number in both lists is the same. If that is not the case, then it is also a missing number.
You have to print all the missing numbers in ascending order.
Print each missing number once, even if it is missing multiple times.
The difference between maximum and minimum number in BB is less than or equal to 100100.
Input Format
There will be four lines of input:

nn - the size of the first list
This is followed by nn space-separated integers that make up the first list.
mm - the size of the second list
This is followed by mm space-separated integers that make up the second list.

Output Format
Output the missing numbers in ascending order.

Constraints
1≤n,m≤10000101≤n,m≤1000010
1≤x≤10000,x∈B1≤x≤10000,x∈B
Xmax−Xmin<101*/
