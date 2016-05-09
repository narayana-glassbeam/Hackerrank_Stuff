const resistor_parallel=(...args)=>{
  let ans = 0;
  for (arg of args) {
    ans += 1/arg;
  }
  return 1/ans;
}

//other one
const resistor_parallel=(...args)=>(1/args.reduce((curr,next)=>curr+1/next,0))

/*Description:

Write the function resistor_parallel that recieve an undefined number of resistances parallel resistors and return the total resistance.

You can assume that there will be no 0 as parameter. Also there will be at least 2 arguments.

Formula: 1/total = 1/r1 + 1/r2 + .. + 1/rn total = 1 / (1/r1 + 1/r2 + .. + 1/rn)

Examples: resistor_parallel(20, 20) will return 10.0 resistor_parallel(20,20, 40): will return 8.0*/
