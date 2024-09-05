const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
const input = require('fs').readFileSync(path).toString().trim().split(/\r?\n/);

let [N, M] = input[0].split(/\s/).map(Number)
const graph = {};

// 모든 노드를 그래프에 추가
for (let i = 1; i <= N; i++) {
    graph[i] = [];
}

// 간선 추가
for (let i = 1; i <= M; i++) {
    let [node, edge] = input[i].split(/\s/).map(Number);
    graph[node].push(edge);
    graph[edge].push(node);  // 무방향 그래프이므로 양방향 간선 추가
}

const dfs = (node, visited) => {
    if (visited.has(node)) return;
    visited.add(node);
    graph[node].forEach(e => dfs(e, visited));
}

const countNetworks = () => {
    const visited = new Set();
    let count = 0;
    for (let node = 1; node <= N; node++) {
        if (!visited.has(node)) {
            count++;
            dfs(node, visited);
        }
    }
    return count;
}

const ret = countNetworks();
console.log(ret);
