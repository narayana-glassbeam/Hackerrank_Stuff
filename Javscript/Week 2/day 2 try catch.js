function processData(my_string) {
   try {
       console.log("Reversed string is : " + my_string.split("").reverse().join(""));
   } catch (ex) {
       console.log("Error : " + ex.message)
   } finally {
       console.log("Type of my_string is : " + typeof my_string)
   }
}
