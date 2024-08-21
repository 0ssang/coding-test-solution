const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');

const n = input[1].split(" ").map(Number);
const m = input[3].split(" ").map(Number);

const set = new Set();
const result = [];
n.forEach((val) => {
    set.add(val);
});

m.forEach(val => {
    set.has(val) ? result.push(1) : result.push(0);
});

console.log(result.join(" "));