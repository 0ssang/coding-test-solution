const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
const input = require('fs').readFileSync(path).toString().trim().split(/\r?\n/);

let [N, K] = input.shift().split(/\s/).map(Number)
const arr = input.shift().split(/\s/).map(Number).sort((a, b) => a - b)
console.log(arr[K-1])