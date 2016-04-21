'use strict'
function main() {
    let n = parseInt(readLine());
    let arr = readLine().split(' ').map(x=>parseInt(x));
    let sum = arr.reduce((prev,curr)=>prev+curr);
    console.log(sum);
}

const sum=arr=>(arr.reduce((prev,curr)=>prev+curr));

/*
Given an array of NN integers, can you find the sum of its elements?

Input Format

The first line contains an integer, NN, denoting the size of the array.
The second line contains NN space-separated integers representing the array's elements.

Output Format

Print the sum of the array's elements as a single integer.
*/
