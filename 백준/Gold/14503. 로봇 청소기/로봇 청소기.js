/*
1. 아이디어: 
- while 문으로 특정조건 종료될때까지 반복
- 4방향을 for문으로 탐색
- 더 이상 탐색 불가능할 경우, 뒤로 한칸 후진
- 후진이 더 이상 불가능한 경우 종료.
2. 시간복잡도
O(N*M) = 50^2 = 2500 < 2억
3. 자료구조
- map : Number[][]
- 로봇청소기 위치, 방향, 전체 청소한 곳 수
*/
const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
const input = require('fs').readFileSync(path).toString().trim().split(/\r?\n/);

const [N, M] = input.shift().split(/\s/).map(Number);
const [R, C, D] = input.shift().split(/\s/).map(Number);
const map = input.map(row => row.split(/\s/).map(Number));
let count = 0;
let y = R;
let x = C;
let dir = D;
const dy = [-1, 0, 1, 0];
const dx = [0, 1, 0, -1];

while(true) {
    if(map[y][x] === 0){
        map[y][x] = 2;
        count += 1;
    }
    let flag = false;
    // 4방향 청소할 곳 검색
    for(let i=1; i<5; i++){
        let nd = (dir - i + 4) % 4;
        let ny = y + dy[nd];
        let nx = x + dx[nd];
        if(ny>=0 && ny<N && nx>=0 && nx<M){
            if(map[ny][nx] === 0){
                dir = nd;
                y = y + dy[dir];
                x = x + dx[dir];
                flag = true;
                break;
            }
        }
    }
    // 4방향 모두 청소할 곳이 없는 경우.
    if(!flag){
        // 뒤쪽 방향이 막혀있는지 확인
        let ny = y - dy[dir];
        let nx = x - dx[dir];
        if(ny>=0 && ny<N && nx>=0 && nx<M){
            if(map[ny][nx] === 1) break;
            else {
                y = ny;
                x = nx;
            }
        } else 
            break;
    }
}
console.log(count);