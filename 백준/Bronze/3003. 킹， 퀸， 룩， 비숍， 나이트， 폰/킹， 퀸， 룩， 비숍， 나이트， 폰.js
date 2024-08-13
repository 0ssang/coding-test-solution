const input = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
const arr = [1,1,2,2,2,8];
const result = [];
arr.forEach((e, i) => {
    result.push(e-input[i]);
});
console.log(result.join(" "));