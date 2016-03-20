Number.prototype.times = function (f) {
  for(var i = 0; i < this.valueOf(); i++) {
    f(i);
  }
}


/*Task

However, I myself find the for loop very complex and unreadable. Think about it - would you know what the for loop does if you've never learned computer programming? For example, if you've never coded before, would you have any idea what this thing in the for loop: i = 0; i < number; i++ means?

Therefore, I would like you to define a method callable on integers, Number.prototype.times, that effectively replaces the for loop. It should work like this:

// Prints "Hello World" to the console 100 times
// Isn't this much more readable?  At least a non-programmer
// knows that something is being executed 100 times!
(100).times(_ => {
  console.log("Hello World");
});*/
