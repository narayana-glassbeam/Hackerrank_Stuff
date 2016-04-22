let add=(a)=> {
  return (b)=> {
    return a+b;
  }
}

const add=a=>b=>a+b;

/*Description:

Write a function that adds from two invocations.

add(3)(4)  // 7
add(12)(20) // 32*/
