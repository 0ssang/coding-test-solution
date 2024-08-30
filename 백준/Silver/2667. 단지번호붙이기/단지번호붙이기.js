// 알고리즘: bfs
// 시간복잡도 : O(V+E);
// V : N^2
// E : 4*N^2
// V+E : 5*N^2 ~= N^2 ~= (N최악 = 25) 625 << 2억  가능

const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
const input = require('fs').readFileSync(path).toString().trim().split(/\r?\n/);
const output = [];

const N = +input.shift();
const arr = [];
// 방문 체크배열 false 초기화
const check = Array.from({length : N}, () => Array(N).fill(false));

// 단지 수
let count = 0;
// 그래프 우,하,좌,상 이동 좌표
const dx = [1, 0, -1, 0];
const dy = [0, 1, 0, -1];

const bfs = (x, y) => {
    // 각 단지 내부의 아파트 수
    let val = 1;
    // bfs 전용 큐 생성
    const queue = [[x, y]];
    while(queue.length > 0){
        let [ex, ey] = queue.shift();
        // 우, 하, 좌, 상 이동
        for(let i=0; i<4; i++){
            let nx = ex + dx[i];
            let ny = ey + dy[i];
            if(nx>=0 && nx<N && ny>=0 && ny<N){
                if(arr[nx][ny] === 1 && !check[nx][ny]){
                    val++;
                    check[nx][ny] = true;
                    queue.push([nx, ny]);
                }
            }
        }
    }
    return val;
}

// 아파트 단지 지도 초기화
for(let i=0; i<N; i++){
    arr.push(input[i].split("").map(Number));
}

// 실행부
for(let i=0; i<N; i++){
    for(let j=0; j<N; j++){
        if(arr[i][j] === 1 && !check[i][j]){
            check[i][j] = true;
            count++;
            output.push(bfs(i, j));
        }
    }
}

console.log(count);
console.log(output.sort((a,b) => a - b).join("\n"));