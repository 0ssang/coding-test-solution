const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const [str, idx] = [input[0], Number(input[1])];
console.log(str[idx-1]);