const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(Number);
const max = Math.max(...input);
console.log(max);
console.log(input.indexOf(max)+1);