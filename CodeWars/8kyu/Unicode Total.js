const uniTotal=s=>(!s ? 0 : s.split("").map((c)=>c.charCodeAt(0)).reduce((p,c)=>p+c))

//even cleaner solution
const uniTotal = str => [...str].reduce((acc, char) => acc + char.charCodeAt(0), 0);

/*Description:

You'll be given a string, and have to return the total of all the unicode characters as an int. Should be able to handle any characters sent at it.

examples:

uniTotal("a") == 97 uniTotal("aaa") == 291*/
