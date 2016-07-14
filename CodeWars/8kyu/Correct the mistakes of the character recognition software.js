const correct=s=>(s.split('').map(x=> x==='0' ? 'O' : x==='5' ? 'S' : x==='1' ? 'I' : x).join(''))

//other solutions
function correct(string) {
  return [...string].map(a => ({'0':'O','5':'S','1':'I'})[a]||a).join('')
}

correct = s => s.replace(/5|0|1/g, v => v==0?'O':v==1?'I':'S')
