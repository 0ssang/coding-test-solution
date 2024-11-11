const input = require('fs').readFileSync('/dev/stdin').toString().trim().split(" ").map(Number);
input.sort((x, y) => x - y);
console.log(input[1]);