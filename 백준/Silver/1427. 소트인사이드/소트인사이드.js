const input = require('fs').readFileSync('/dev/stdin').toString().trim();
const numbers = input.split('').map(v => +v).sort((a,b) => b-a);
console.log(numbers.join(""));