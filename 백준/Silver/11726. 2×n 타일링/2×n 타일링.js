const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
const input = require('fs').readFileSync(path).toString().trim();
const num = +input;

const dp = Array(num + 1).fill(0);
dp[1] = 1;
dp[2] = 2;

for(let i=3; i<=num; i++){
    dp[i] = (dp[i-1] + dp[i-2]) % 10007;
}
console.log(dp[num]);