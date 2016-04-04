import java.io.BufferedReader;
import java.io.InputStreamReader;

object HelloWorld {
  def main(args: Array[String]) {
    val br = new BufferedReader(new InputStreamReader(System.in))
    val lines = Stream.continually(br.readLine()).takeWhile(_ != null)
    for(l<-lines) {
        println(formatString(l))
    }
  }

     def formatString(s: String): String = {
      val comm = s.indexOf("//")
      if(comm>=0) {
        s.substring(0,comm).replace("->",".").concat(s.substring(comm,s.length))
      } else {
        s.replaceAll("->", ".")
      }
    }

}

//other way to read lines
def main(args: Array[String]) {
    val br = new BufferedReader(new InputStreamReader(System.in))
    var line: String = null
    while({ line = br.readLine() ; line != null }) {
        println(formatString(line))
    }
  }

/*You are converting an old code for a new version of the compiler.

In the old code we have used "->" for pointers. But now we have to replace each "->" with a ".". But this replacement shouldn't be done inside commments. A comment is a string that starts with "//" and terminates at the end of the line.

Input:

At max.
2000
2000 lines of code.

Each line of code consists of at maximum
60
60 characters.*/
