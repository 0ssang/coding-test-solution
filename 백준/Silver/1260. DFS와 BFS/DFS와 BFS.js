const input = require('fs').readFileSync("/dev/stdin").toString().trim().split('\n');
const [vertices, edges, start] = input[0].split(" ").map(Number);
const graph = Array.from({ length: vertices + 1 }, () => []);

// 간선 입력
for (let i = 1; i <= edges; i++) {
    const [u, v] = input[i].split(" ").map(Number);
    graph[u].push(v);
    graph[v].push(u);
}

// 각 노드의 인접 리스트 정렬
for (let i = 1; i <= vertices; i++) {
    graph[i].sort((a, b) => a - b);
}

const dfsVisited = Array(vertices + 1).fill(false);
const dfsResult = [];
dfs(graph, start, dfsVisited, dfsResult);
console.log(dfsResult.join(" "));

const bfsResult = bfs(graph, start, vertices);
console.log(bfsResult.join(" "));

function dfs(graph, current, visited, result) {
    visited[current] = true;
    result.push(current);

    for (const next of graph[current]) { // 수정된 문법
        if (!visited[next]) {
            dfs(graph, next, visited, result);
        }
    }
}

function bfs(graph, start, vertices) {
    const result = [];
    const que = [];
    const visited = Array(vertices + 1).fill(false);

    visited[start] = true;
    que.push(start);

    while (que.length > 0) {
        const current = que.shift();
        result.push(current);

        for (const next of graph[current]) { // 수정된 문법
            if (!visited[next]) {
                que.push(next);
                visited[next] = true;
            }
        }
    }
    return result;
}