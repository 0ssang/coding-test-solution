const [M, N] = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(Number);

const primes = [];
// 소수 판별 함수
const isPrime = (num) => {
    if (num < 2) return false;
    for(let i=2; i*i<=num; i++){
        if(num % i === 0) return false;
    }
    return true;
}
// 소수 구하기
for(let i=M; i<=N; i++){
    if(isPrime(i)) primes.push(i);
}
// 출력
if(primes.length === 0){
    console.log(-1);
}else{
    const sum = primes.reduce((acc, cur) => acc + cur, 0);
    console.log(`${sum}\n${primes[0]}`);
}