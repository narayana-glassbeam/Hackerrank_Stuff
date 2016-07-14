unluckyDays=y=>{
  let c=0;
  for (let i=0;i<12;i++) {
    if(new Date(y,i,13).getDay()==5) c++;
  }
  return c;
}

//other solutions
const unluckyDays = year =>
Array.from({length: 12}, (item, index) => new Date(year, index, 13)).reduce((a, b) => a + (b.getDay() == 5 ? 1 : 0), 0);


/*Description:

Friday 13th or Black Friday is considered as unlucky day. Calculate how many unlucky days are in the given year.

Find the number of Friday 13th in the given year.

Input: Year as an integer.

Output: Number of Black Fridays in the year as an integer.

Precondition: 1000 < |year| < 3000*/
