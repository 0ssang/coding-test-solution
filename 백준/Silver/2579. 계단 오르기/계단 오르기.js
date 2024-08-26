let [n, ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split("\n");
const arr = input.map(Number);
arr.unshift(0);
const dp = new Array(+n).fill(0);

dp[1] = arr[1];
dp[2] = arr[1] + arr[2];
dp[3] = arr[3] + Math.max(arr[1], arr[2]);

for(let i=4; i<=n; i++){
    dp[i] = Math.max(arr[i] + arr[i-1] + dp[i-3], arr[i] + dp[i-2]);
}
console.log(dp[n]);