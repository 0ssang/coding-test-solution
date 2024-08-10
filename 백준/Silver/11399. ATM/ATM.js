const [n, input] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const res = input.split(" ").sort((a, b) => a - b).reduce((acc, cur, i) => acc + cur * (n-i), 0);
console.log(res);