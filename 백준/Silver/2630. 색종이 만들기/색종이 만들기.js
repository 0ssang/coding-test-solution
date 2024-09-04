const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
let [N, ...input] = require('fs').readFileSync(path).toString().trim().split(/\r?\n/);
N = +N
const paper = input.map(line => line.split(/\s/).map(Number))
let whiteCount = 0;
let blueCount = 0;
// 종료조건
// 1. 잘라진 종이가 모두 하얀색 또는 모두 파란색으로 칠해진 경우
// 2. 길이가 1인 정사각형으로 잘라진 경우

// 진행 - 시작좌표, N / 2 정보를 가지고 재귀호출
// 1. 전체 종이가 모두 같은 색으로 칠해져 있지 않으면 사각형을 4등분한다.
// 2. 종료조건 검사.
// 3. 반복

// divide and conquer => recuresive하게 풀이
const recur = (x, y, n) => {
    if(hasOneColor(x, y, n)){
        if(paper[y][x] === 0) whiteCount++
        else blueCount++
        return
    }
    let half = n / 2
    recur(x, y, half) // 1사분면
    recur(x+half, y, half) // 2사분면
    recur(x, y+half, half) // 3사분면
    recur(x+half, y+half, half) // 4사분면
}

const hasOneColor = (x, y, n) => {
    let color = paper[y][x]
    for(let j=y; j<y+n; j++){
        for(let i=x; i<x+n; i++){
            if(paper[j][i] !== color) return false
        }
    }
    return true
}

recur(0,0,N)
console.log(whiteCount)
console.log(blueCount)