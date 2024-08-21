const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');

const n = input[1].split(" ").map(Number);
const m = input[3].split(" ").map(Number);

const map = new Map();
const result = [];
n.forEach((val, idx) => {
    map.set(val, idx);
});

m.forEach(val => {
    map.has(val) ? result.push(1) : result.push(0);
});

console.log(result.join(" "));