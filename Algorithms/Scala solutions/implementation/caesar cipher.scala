object Solution {
    def main(args: Array[String]) {
        val capital = ('A'to'Z').toList
        val small = ('a'to'z').toList
        val length = readInt
        val cipher = readLine.toList
        val K = readInt%26
        val deciphered = cipher.map(s=> {
            if(capital.contains(s)) {
               if (s+K>90) (64+((s+K)%90)).toChar else (s+K).toChar
            }
            else if(small.contains(s)) {
                if (s+K>122) (96+((s+K)%122)).toChar else (s+K).toChar
            }
            else s
        }).mkString
        println(deciphered)
    }
}

//second solution, more compact
object Solution {
    def main(args: Array[String]) {
        readInt
        val cipher = readLine
        val K = readInt%26
        println(decipher(cipher,K))
    }
    def decipher(cipher: String, k: Int): String = {
        cipher.map(c=> {
            if('a'<= c && c <= 'z') (if (c + k > 'z') 'a'-1+(c+k)%'z' else c + k).toChar
            else if ('A'<= c && c <= 'Z') (if (c + k > 'Z') 'A'-1+(c+k)%'Z' else c + k).toChar
            else c
        })
    }
}

//other
(if (c + k > 'z') c + k - 'z' - 1 + 'a' else c + k).asInstanceOf[Char]

/*Problem Statement

Julius Caesar protected his confidential information by encrypting it in a cipher. Caesar's cipher rotated every letter in a string by a fixed number, K, making it unreadable by his enemies. Given a string, S, and a number, K, encrypt S and print the resulting string.

Note: The cipher only encrypts letters; symbols, such as -, remain unencrypted.

Input Format

The first line contains an integer, N, which is the length of the unencrypted string.
The second line contains the unencrypted string, S.
The third line contains the integer encryption key, K, which is the number of letters to rotate.

Constraints
1≤N≤100
0≤K≤100
S is a valid ASCII string and doesn't contain any spaces.

Output Format

For each test case, print the encoded string.*/
