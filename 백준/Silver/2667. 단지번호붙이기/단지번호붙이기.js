const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
const input = require('fs').readFileSync(path).toString().trim().split(/\r?\n/);
const output = [];

const N = +input.shift();
const arr = [];
const check = Array.from({length : N}, () => Array(N).fill(false));

const dx = [1, 0, -1, 0];
const dy = [0, 1, 0, -1];

let count = 0;
// 아파트 단지 지도 초기화
for(let i=0; i<N; i++){
    arr.push(input[i].split("").map(Number));
}

const dfs = (y, x) => {
    count++;
    for(let i=0; i<4; i++){
        let ny = y + dy[i];
        let nx = x + dx[i];
        if(ny>=0 && ny<N && nx>=0 && nx<N){
            if(arr[ny][nx] === 1 && !check[ny][nx]){
                check[ny][nx] = true;
                dfs(ny, nx);
            }
        }
    }
}

// 실행부
for(let j=0; j<N; j++){
    for(let i=0; i<N; i++){
        if(arr[j][i] === 1 && !check[j][i]){
            check[j][i]= true;
            count = 0;
            dfs(j, i);
            output.push(count);
        }
    }
}

console.log(output.length);
console.log(output.sort((a,b) => a - b).join("\n"));