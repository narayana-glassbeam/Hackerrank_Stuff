object Solution {
    def main(args: Array[String]) {
        val Array(n,k) = readLine.split(" ").map(_.toInt);
        val problems = readLine.split(" ").map(_.toInt);
        var count = 0;
        var page = 1;

        for (i <- 0 until problems.length) {
          val curr = (1 to problems(i)).toArray;
          for (j <- 0 until curr.length by k) {
            if(curr.slice(j,k+j).contains(page)) count+=1
            page+=1
          }
        }
        println(count)
    }
}

//different approach
for(c <- problems) {
  for(p <- 1 to c) {
    if(page == p) {
      count += 1
    }
    if(p % k == 0) {
      page += 1
    }
  }
  if(c % k != 0) {
    page += 1
  }
}


/*Lisa just got a new math workbook. A workbook contains exercise problems, grouped into chapters.

There are nn chapters in Lisa's workbook, numbered from 11 to nn.
The ii-th chapter has titi problems, numbered from 11 to titi.
Each page can hold up to kk problems. There are no empty pages or unnecessary spaces, so only the last page of a chapter may contain fewer than kk problems.
Each new chapter starts on a new page, so a page will never contain problems from more than one chapter.
The page number indexing starts at 11.
Lisa believes a problem to be special if its index (within a chapter) is the same as the page number where it's located. Given the details for Lisa's workbook, can you count its number of special problems?

Note: See the diagram in the Explanation section for more details.

Input Format

The first line contains two integers nn and kk — the number of chapters and the maximum number of problems per page respectively.
The second line contains nn integers t1,t2,…,tnt1,t2,…,tn, where titi denotes the number of problems in the ii-th chapter.

Constraints

1≤n,k,ti≤1001≤n,k,ti≤100
Output Format

Print the number of special problems in Lisa's workbook.*/
