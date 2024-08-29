const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
const input = require('fs').readFileSync(path).toString().trim().split(/\r?\n/);
const output = [];
let testcase = +input.shift();

let arr;
let visited;

let dx = [1, 0, -1, 0];
let dy = [0, 1, 0, -1];

const bfs = (x, y, M, N) => {
    const queue = [[x, y]];
    while(queue.length > 0){
        let [ex, ey] = queue.shift();
        for(let i=0; i<4; i++){
            let nx = ex + dx[i];
            let ny = ey + dy[i];
            if(nx>=0 && nx<M && ny>=0 && ny<N){
                if(arr[nx][ny] === 1 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    queue.push([nx, ny]);
                }
            }
        }
    }
}

while(testcase--){
    const [M, N, K] = input.shift().split(/\s/).map(Number);
    arr = Array.from({length: M}, () => Array(N).fill(0));
    visited = Array.from({length: M}, () => Array(N).fill(false));
    let count = 0;

    for(let i=0; i<K; i++){
        let [x, y] = input.shift().split(/\s/).map(Number);
        arr[x][y] = 1;
    }

    for(let i=0; i<M; i++){
        for(let j=0; j<N; j++){
            if(arr[i][j] === 1 && !visited[i][j]){
                visited[i][j] = true;
                count++;
                bfs(i, j, M, N);
            }
        }
    }
    output.push(count);
}
console.log(output.join("\n"));