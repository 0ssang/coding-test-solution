// fs 모듈 사용
const input = require('fs').readFileSync('/dev/stdin').toString().trim().split(' ').map(Number);

// 구조분해 할당
const [A, B] = [input[0], input[1]];

if(A < B){
    console.log('<');
} else if (A > B){
    console.log('>')
} else if (A == B){
    console.log('==')
}