const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
const input = require('fs').readFileSync(path).toString().trim().split(/\r?\n/);

let [N, K] = input.shift().split(/\s/).map(Number);
const arr = input.shift().split(/\s/).map(Number);

let each = 0;
for(let i=0; i<K; i++){
    each += arr[i];
}
let max = each;
for(let i=K; i<N; i++){
    each += arr[i];
    each -= arr[i-K]
    max = Math.max(max, each)
}

console.log(max);