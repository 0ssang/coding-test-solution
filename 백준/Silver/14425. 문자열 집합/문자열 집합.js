const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const [n, m] = input[0].split(" ").map(Number);

const set = new Set();
let count = 0;
input.forEach((val, idx) => {
    if(idx !== 0 && idx <= n) set.add(val);
    else if(idx !== 0 && set.has(val)) count++;
});
console.log(count);