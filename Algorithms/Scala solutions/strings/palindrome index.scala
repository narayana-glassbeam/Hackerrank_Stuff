object Solution {
    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            val s = readLine
            if (s == s.reverse) println(-1)
            else {
                var found = false
                var curr = 0
                for (i <- 0 until s.length/2 if !found) {
                    if (s(i)!=s(s.length-1-i)) {
                        val s1 = s.substring(0,i)+s.substring(i+1,s.length)
                        if(s1==s1.reverse) curr = i
                        else curr = s.length-1-i
                        found = true
                    }
                }
                println(curr)
            }

        }
    }
}

//my other, not so fast, solution that fails one TC with timeout
object Solution {

    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            val s = readLine
            if (s == s.reverse) println(-1)
            else {
                val dis = s.distinct
                var found = false
                var curr = 0
                for (c <- dis if !found) {
                    if(s.count(_==c)%2!=0) {
                        for (i <- 0 until s.length) {
                            if (s(i)==c) {
                                val s1 = s.substring(0,i)+s.substring(i+1,s.length)
                                if(s1==s1.reverse) {
                                    found = true
                                    curr = i
                                }
                            }
                        }
                    }
                }
                println(curr)
            }
        }
    }
}
