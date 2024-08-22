const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').slice(1);

const A = input.shift().split(" ").map(Number);
const B = new Set(input.shift().split(" ").map(Number));

const AandB = A.reduce((acc, cur) => B.has(cur) ? acc+1 : acc , 0);

console.log(A.length+B.size - 2*AandB);