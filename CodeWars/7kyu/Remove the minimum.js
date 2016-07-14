const removeSmallest=n=> {
   n.splice(n.indexOf(Math.min.apply(Math, n)),1);
   return n;
}

//similar
const removeSmallest = (e) => (e.splice(e.indexOf(Math.min.apply(Math, e)),1), e);

//using the spread operator
function removeSmallest(numbers) {
  let indexOfMin = numbers.indexOf(Math.min(...numbers));
  return [...numbers.slice(0, indexOfMin), ...numbers.slice(indexOfMin + 1)];
}


const removeSmallest=n=>(n.splice(n.indexOf(Math.min(...n)),1),n)


/*The museum of incredible dull things

The museum of incredible dull things wants to get rid of some exhibitions. Miriam, the interior architect, comes up with a plan to remove the most boring exhibitions. She gives them a rating, and then removes the one with the lowest rating.

However, just as she finished rating all exhibitions, she's off to an important fair, so she asks you to write a program that tells her the ratings of the items after one removed the lowest one. Fair enough.

Task

Given an array of integers, remove the smallest value. If there are multiple elements with the same value, remove the one with a lower index. If you get an empty array/list, return an empty array/list.

Don't change the order of the elements that are left.*/
