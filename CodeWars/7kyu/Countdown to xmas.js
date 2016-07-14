daysUntilChristmas=(days)=> {
  let xmass = new Date();
  xmass.setFullYear(days.getFullYear(), 11, 25);

  let millisecondsPerDay = 1000 * 60 * 60 * 24;
  let millisBetween = xmass.getTime() - days.getTime();

  let daysLeft = millisBetween / millisecondsPerDay;
  let res = Math.floor(daysLeft)

  let isLeap = new Date(days.getFullYear()+1, 1, 29).getMonth() == 1
  return (res>=0) ? res : (isLeap) ? res+366 : res+365
}

//cleaner one
function daysUntilChristmas(date) {
  var xmas = new Date(date.getFullYear(),11,25), nextYear = false;
  if (date > xmas){
    xmas.setFullYear(xmas.getFullYear() + 1);
    nextYear = true;
  }
  var days = (Math.abs(xmas - date) / (24 * 3600 * 1e3)) %365;
  return ((days == 0) && nextYear) ? 365 : days;
}


/*Polly is 8 years old. She is eagerly awaiting Christmas as she has a bone to pick with Santa Claus. Last year she asked for a horse, and he brought her a dolls house. Understandably she is livid.

The days seem to drag and drag so Polly asks her friend to help her keep count of how long it is until Christmas, in days. She will start counting from the first of December.

Your function should take 1 argument (a Date object) which will be the day of the year it is currently. The function should then work out how many days it is until Christmas.

Watch out for leap years!*/
