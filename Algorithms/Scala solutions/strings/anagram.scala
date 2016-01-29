object Solution {

    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            val s = readLine
            if (s.length%2!=0) println(-1)
            else {
                val s1 = s.substring(0,s.length/2)
                val s2 = s.substring(s.length/2,s.length)
                val c1 = new Array[Int](26)
                val c2 = new Array[Int](26)
                for (c <- s1) c1(c-'a')+=1
                for (c <- s2) c2(c-'a')+=1
                var result = 0
                for (i <- 0 to 25) {
                   result += math.abs(c1(i)-c2(i))
                }
                println(result/2)
            }
        }
    }
}

//similar solution
if (s.length%2!=0) println(-1)
else {
   val s1 = s.substring(0,s.length/2)
   val s2 = s.substring(s.length/2,s.length)

   val c1 = new Array[Int](26)
   for (c <- s1) c1(c-'a')-=1
   for (c <- s2) c1(c-'a')+=1

   val less = c1.filter(_<0).sum
   val more = c1.filter(_>0).sum

   println(more.min(less) + (more - less).abs)

}

//other
if(str.size % 2 == 1) println(-1)
else {
    val (first, second) = str.splitAt(str.size / 2)
    val fmap = sizeMap(first)
    val smap = sizeMap(second)

    val r = ('a' to 'z').map { x =>
        val v1 = fmap.getOrElse(x, 0)
        val v2 = smap.getOrElse(x, 0)
        math.abs(v1 - v2)
    }.sum
    println( r / 2)
}

//this is some solution
object Solution {
      val alpha = ('a' to 'z').map{c => (c, 0)}.toMap

      def toAnagram(s: String) = {
        if(s.length % 2 == 1) -1
        else{
              val (a, b) = (s.take(s.length/2), s.drop(s.length/2))
            alpha.++(a.groupBy{identity}.mapValues{_.length}).toList.zip(alpha.++(b.groupBy{identity}.mapValues{_.length}).toList).map{case ((_,a), (_, b)) => math.abs(a-b)}.sum / 2
        }
    }

    def main(args: Array[String]) {
          (1 to readInt).foreach{ _ =>
            println(toAnagram(readLine))
        }
    }
}

//nice
if (words.length % 2 == 0) {
    changes = 0
    var (a, b) = words.splitAt(words.length / 2)
    var c = a.toList.toSet

    for (d <- c) {
        var bCount = b.count(_ == d)
        var aCount = a.count(_ == d)

        if (aCount > bCount) {
            changes += aCount - bCount
        }
    }
}
println(changes);

//LOL
val (s1, s2) = s.splitAt(s.length/2)
val result = s1.toCharArray.diff(s2.toCharArray).length
//or
val result = s1.diff(s2).size
