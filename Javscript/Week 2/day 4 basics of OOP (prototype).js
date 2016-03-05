function Square(A, B, C, D){
    this.A = A;
    this.B = B;
    this.C = C;
    this.D = D;
}

Square.prototype.isSquare = function() {
    if(this.A===this.B && this.B===this.C && this.C===this.D) console.log(true);
    else console.log(false);
}
