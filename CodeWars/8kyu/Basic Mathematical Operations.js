const basicOp=(op,v1,v2)=>(op==='+'? v1+v2 : op==='-'? v1-v2 : op==='*'? v1*v2 : v1/v2)

//other solutions
const basicOp=(op,v1,v2)=>eval(`${v1} ${op} ${v2}`)
const basicOp=(op,v1,v2)=>eval(v1+op+v2)

/*Description:

Your task is to create a function - basicOp().

The function should take three arguments - operation(string), value1(integer), value2(integer). The function should return result of integers after applying chosen operation.

Examples:

basicOp('+', 4, 7) // Output: 11

basicOp('-', 15, 18) // Output: -3

basicOp('*', 5, 5) // Output: 25

basicOp('/', 49, 7) // Output: 7*/
