// 알고리즘: bfs
// 시간복잡도 : O(V+E)
// V = n * m;
// E = 4 * n * m;
// V + E = 5 * 250000 = 1000000 <= 2억 ==> 가능

let input = require('fs').readFileSync('/dev/stdin').toString().trim().split("\n");

const [n, m] = input.shift().split(/\s/).map(Number);

const graph = input.map(rows => rows.split(/\s/).map(Number));
const visited = Array.from({length: n}, () => Array(m).fill(false));
let count = 0;
let maxVal = 0;
let dx = [1,0,-1,0];
let dy = [0,1,0,-1];

const bfs = (i, j) => {
    let res = 1;
    const queue = [[i, j]];
    while(queue.length > 0){
        let [ex, ey] = queue.shift();
        for(let k=0; k<4; k++){
            let nx = ex + dx[k];
            let ny = ey + dy[k];
            if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                if(graph[nx][ny] === 1 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    res++;
                    queue.push([nx, ny]);
                }
            }
        }
    }
    return res;
}

// 실행부
for(let i=0; i<n; i++){
    for(let j=0; j<m; j++){
        if(graph[i][j] === 1 && !visited[i][j]){
            visited[i][j] = true;
            count++;
            maxVal = Math.max(maxVal, bfs(i, j));
        }
    }
}

console.log(count);
console.log(maxVal);