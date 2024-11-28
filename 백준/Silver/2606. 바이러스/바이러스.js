const input = require('fs')
    .readFileSync(process.platform === "linux" ? 0 : "./input.txt")
    .toString()
    .trim()
    .split('\n');

const N = +input[0];
const pair = +input[1];
const graph = Array.from( {length: N + 1}, () => [] );
for(let i=2; i<=pair+1; i++){
    const [x, y] = input[i].split(" ").map(Number);
    graph[x].push(y);
    graph[y].push(x);
}

const vst = Array(graph.length).fill(false);
const que = [];
que.push(1);
vst[1] = true;
let cnt = 0;
while(que.length > 0){
    const cur = que.shift();
    for(const next of graph[cur]){
        if(!vst[next]){
            vst[next] = true;
            que.push(next);
            cnt++;
        }
    }
}
console.log(cnt);