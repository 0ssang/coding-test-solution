// 백트래킹 N >= 10 가능
const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
const [N, M] = require('fs').readFileSync(path).toString().trim().split(/\s/).map(Number);

const result = [];
const check = Array(N+1).fill(false);
const recur = num => {
    if(num === M){
        console.log(result.join(" "));
        return;
    }

    for(let i=1; i<N+1; i++){
        if(!check[i]){
            check[i] = true;
            result.push(i);
            recur(num + 1);
            check[i] = false;
            result.pop();
        }
    }
}

recur(0);