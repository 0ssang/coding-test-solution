const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().trim().split('\n');

let n = Number(input[0]);
let a = input[1].split(' ').map(Number);
let b = input[2].split(' ').map(Number);

a.sort((x, y) => x - y);
b.sort((x, y) => y - x);

let s = 0;
for (let i = 0; i < n; i++) {
  s += a[i] * b[i];
}

console.log(s);