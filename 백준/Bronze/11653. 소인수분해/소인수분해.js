const input = require('fs').readFileSync('/dev/stdin').toString().trim();
let num = +input;
const arr = [];

for(let i = 2; i <= Math.sqrt(num); i++) {
    while (num % i === 0) {
        num /= i;
        arr.push(i);
    }
}

// 만약 num이 1이 아니고 소수로 남아 있다면 배열에 추가
if (num > 1) {
    arr.push(num);
}

console.log(arr.join('\n'));
