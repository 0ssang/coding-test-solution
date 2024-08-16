const [N, K] = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);
const divisors = [];

for(let i=1; i<=N; i++){
    if(N % i === 0) divisors.push(i);
}

if(divisors.length < K) console.log(0);
else console.log(divisors[K-1]);