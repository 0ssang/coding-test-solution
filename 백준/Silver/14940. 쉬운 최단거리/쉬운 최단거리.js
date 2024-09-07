const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
const [NM,...input] = require('fs').readFileSync(path).toString().trim().split(/\r?\n/);
const [N, M] = NM.split(/\s/).map(Number)

// 지도 생성 및 시작 좌표 구하기
let start;
const map = input.map((row, y) => row.split(/\s/).map((col, x) => {
    if(col === '2') start = [y, x]
    return +col
}))

// 거리벡터, BFS 탐색 시 방문확인용 배열
const dy = [1, 0, -1, 0]
const dx = [0, 1, 0, -1]
const visited = Array.from({length: N}, () => Array(M).fill(false))

// bfs 함수
const bfs = (point) => {
    let [j, i] = point
    visited[j][i] = true
    map[j][i] = 0
    const queue = [[j, i]]
    let round = 1

    while(queue.length > 0){
        const size = queue.length
        for(let s=0; s<size; s++){
            let [y, x] = queue.shift()
            for(let k=0; k<4; k++){
                let ny = y + dy[k]
                let nx = x + dx[k]
                if(ny>=0 && ny<N && nx>=0 && nx<M){
                    if(!visited[ny][nx]){
                        visited[ny][nx] = true
                        if(map[ny][nx] === 0) {
                            map[ny][nx] = 0
                        } else if(map[ny][nx] === 1){
                            map[ny][nx] = round
                            queue.push([ny, nx])
                        }
                    }
                }
            }
        }
        round++
    }

    for(let j=0; j<N; j++){
        for(let i=0; i<M; i++){
            if(!visited[j][i] && map[j][i] === 1)
                map[j][i] = -1
        }
    }
}

const printMap = () => {
    console.log(map.map(row => row.join(" ")).join("\n"))
}

const solution = () => {
    bfs(start)
    printMap()
}

solution()