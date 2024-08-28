const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
const input = require('fs').readFileSync(path).toString().trim().split(/\r?\n/);
const output = [];

const arr = input[1].split(/\s/).map(Number);
const sum = Array(arr.length+1).fill(0);
arr.forEach((val, idx) => {
    sum[idx + 1] = sum[idx] + val; 
});

input.slice(2).forEach(val => {
    const [i, j] = val.split(/\s/).map(Number);
    output.push(sum[j] - sum[i-1]);
})

console.log(output.join("\n"));