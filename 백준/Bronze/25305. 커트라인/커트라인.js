const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const [N, k] = input[0].trim().split(' ').map(v => +v);
const scores = input[1].trim().split(' ').map(v => +v).sort((a,b) => b-a);

console.log(scores[k-1]);