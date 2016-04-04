class Guesser {
  constructor(number, lives) {
    this.number = number;
    this.lives = lives;
  }

  guess(n) {
    if (this.lives>0) {
      if(n==this.number) return true;
      else {
        this.lives--;
        return false;
      }
    } else throw Error;
  }
}

//other solutions
guess(n) {
    if (!this.lives) throw Error
    this.lives--
    return n === this.number
  }

 guess(n) {
    if (this.lives <= 0){
      throw "";
    }
    return (n == this.number) || (this.lives-- == this.lives);
  }
