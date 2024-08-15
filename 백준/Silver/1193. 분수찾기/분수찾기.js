const input = require('fs').readFileSync('/dev/stdin').toString().trim();
// 1. x를 가지고 round, sum를 구함
// 2. (sum - x + 1)로 key1 값을 구함
// 3. (round+1) - key1 로 key2를 구함
// 4. round가 짝수이면 key2/key1 출력, 홀수이면 key1/key2 출력

const x = Number(input);
let round = 1;
let sum = 1;
while(sum < x){
    round++;
    sum += round;
}
const key1 = sum - x + 1;
const key2 = round+1 - key1;

console.log(round % 2 === 0 ? `${key2}/${key1}` : `${key1}/${key2}`);