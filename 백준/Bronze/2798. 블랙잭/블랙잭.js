const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const [N, M] = input[0].split(' ').map(v => +v);
const numbers = input[1].split(' ').map(v => +v);

let result = 0;

for(let i=0; i<N-2; i++){
    for(let j=i+1; j<N-1; j++){
        for(let k=j+1; k<N; k++){
            let sum = numbers[i] + numbers[j] + numbers[k];
            if(sum <= M && sum > result )
                result = sum;
        }
    }
}

console.log(result);