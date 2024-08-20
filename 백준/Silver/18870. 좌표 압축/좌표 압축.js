const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').slice(1);
const arr = input[0].split(' ').map(Number);
const uniq = [...new Set(arr)].sort((a, b) => b - a);
const obj = {};

uniq.forEach((val, idx) => {
    obj[val] = uniq.length - idx - 1;
});

console.log(arr.map(item => obj[item]).join(" "));