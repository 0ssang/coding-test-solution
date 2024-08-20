const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').slice(1);
const arr = input[0].split(' ').map(Number);
const uniq = [...new Set(arr)].sort((a, b) => a - b);
const map = new Map();

uniq.forEach((val, idx) => {
    map.set(val, idx);
});

console.log(arr.map(val=> map.get(val)).join(" "));