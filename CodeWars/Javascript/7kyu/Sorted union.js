const uniteUnique=(...args)=>(new Set([].concat(...args)))

//other solution
const uniteUnique=(...args)=> {
  let sol = [].concat(...args);
  return sol.filter((arg,i)=>sol.indexOf(arg)==i);
}
