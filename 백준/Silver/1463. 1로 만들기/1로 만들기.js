const input = require('fs').readFileSync('/dev/stdin').toString().trim();
let target = +input;
// 14 => 7 => 6 => 3 => 1 

// DP: 이전의 최소 계산 횟수를 기억하기
// 배열의 index를 계산 값으로 활용

// 경우의 수 : 짝수(2의 배수) || 홀수 => (3의 배수 or 소수)
// 예외 : 공배수 => 2개의 경우의 수 발생 Math.min()으로 최소 경로 구하기

const arr = new Array(target+1).fill(0);
for(let i=2; i<=target; i++){
    arr[i] = arr[i-1] + 1;
    if(i % 2 === 0){
        arr[i] = Math.min(arr[i], arr[i/2] + 1);
    }
    if(i % 3 === 0){
        arr[i] = Math.min(arr[i], arr[i/3] + 1);
    }
}
console.log(arr[target]);