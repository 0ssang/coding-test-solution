const input = require("fs").readFileSync("/dev/stdin").toString().trim();
const N = +input;
const dp = new Array(N+1).fill(-1);
if(N >= 3) dp[3] = 1;
if(N >= 5) dp[5] = 1;
for(let i=6; i<=N; i++){
    if(i % 5 === 0){
        dp[i] = dp[i - 5] + 1;
    } else if(i % 3 === 0){
        dp[i] = dp[i - 3] + 1;
    } else {
        if(dp[i-3] !== -1 && dp[i-5] !== -1){
            dp[i] = Math.min(dp[i-3], dp[i-5]) + 1;
        }
    }
}
console.log(dp[N]);