function myFilter(arr, cb){
    var filtered = [];
    for (var i in arr) {
        if(cb(arr[i]))
            filtered.push(arr[i]);
    }
   return filtered;
}

function processData(inputArray) {
    //In blank write anonymous function, which takes one parameter and returns true if its even or false if its odd.
    console.log(myFilter(inputArray, (x) => x%2==0));
}
