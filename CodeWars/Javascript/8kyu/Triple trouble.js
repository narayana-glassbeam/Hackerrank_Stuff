tripleTrouble=(one, two, three)=>{
  let str = "";
  for (let i = 0; i<one.length; i++) {
      str+=one[i]+two[i]+three[i];
  }
  return str;
 }

//other solutions using map and array
const tripleTrouble=(o, t, h)=>o.split("").map((a,i)=>[a,t[i],h[i]].join("")).join("");

let tripleTrouble = (a,b,c) => [...Array(a.length)].reduce((r, _, i) => r+a[i]+b[i]+c[i], '');

var tripleTrouble=(a,b,c)=>{var r='';for(var i in a)r+=a[i]+b[i]+c[i];return r;}
