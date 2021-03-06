//WARNING: this solution does not pass every test cases, it is not fully optimized and it fails with RUNTIME EXCEPTION
object Solution {

    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            val info = readLine.split(" ")
            val patient = info(0)
            val virus = info(1)
            val list = getSubstrings(patient, virus, virus.length).zipWithIndex
            val solve = list.filter(i => (matchVirus(i._1,virus))).map(_._2).mkString(" ")
            println(if(solve.isEmpty) "No Match!" else solve)
    }
}

    def getSubstrings (word: String, virus: String, size: Int ) : List[String] = {
        val indexes = StringBuilder.newBuilder
        for (i <- 0 to word.length-size) {
               indexes.append(word.substring(i,size+i)+" ")
        }
        indexes.toString.split(' ').toList
    }
    def matchVirus(word: String, virus: String): Boolean = {
        if (word==virus) true
        else {
            val sb = StringBuilder.newBuilder
            var result = false
            for (i <- 0 to word.length-1 if !result) {
                sb.append(virus)
                sb.setCharAt(i,word(i))
                if (word==sb.toString) result= true
                sb.setLength(0)
            }
            result
        }
    }

}

//this one times out on 5/10 test cases
object Solution {
    def main(args: Array[String]) {
        for (_ <- 0 until readInt) {
            val info = readLine.split(" ")
            val patientDNA = info(0)
            val virusDNA = info(1)
            val solve = findIndexes(patientDNA, virusDNA, virusDNA.length)
            println(if(solve.isEmpty) "No Match!" else solve)
        }

    }
    def findIndexes (word: String, virus: String, size: Int ) : String = {
        val indexes = StringBuilder.newBuilder
        for (i <- 0 to word.length-size) {
            if (equals(word.substring(i,size+i),virus)) indexes.append(i+" ")
        }
        indexes.toString
    }
    def equals(s1: String, s2: String): Boolean = {
        if (s1==s2) return true
        var count = 0
        for(i <- 0 until s2.length) {
            if (s1(i)!=s2(i)) count+=1
            if (count>1) return false
        }
        true
    }
}

/*Problem Statement

Oh!! Mankind is in trouble again. This time it's a deadly disease spreading at a rate never seen before. The need of the hour is to set up efficient virus detectors. You are the lead at Central Hospital and need to find a fast and reliable way to detect the 'foot-prints' of the virus DNA in that of the patient.

The DNA of the patient as well as of the virus consists of lower case letters. Since the data collected is raw, there may be some errors. You will need to find all substrings in the patient DNA that either exactly matches the virus DNA, or has at most one mismatch.

For example: "aa" and "aa" are matching, "ab" and "aa" are matching, while "ab" and "ba" are not.

Input Format
The first line contains the number of test cases T. T test cases follow.
Each case contains two strings P(Patient DNA) and V(Virus DNA) separated by space.

Output Format
Output T lines, one corresponding to each test case. For each test case, output a space delimited list of starting indices (0 indexed) of substrings of P which are matching with V according to the condition mentioned above. The indices have to be in an increasing order. If there is no matching output No Match!.

Constraints
1 <= T <= 10
P and V contain at most 100000 characters each.
All characters in P and V are lowercase letters.

Sample Input

3
abbab ba
hello world
banana nan
Sample Output

1 2
No Match!
0 2
Explanation
For the first case, the substrings of P starting at indices 1 and 2 are "bb" and "ba" and they are matching with the string V which is "ba".
For the second case, there are no matching substrings so the output is a blank line.*/
