let [n, m, ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split("\n");
n = +n;
m = +m;
const map = new Map();
const infection = new Array(n+1).fill(false);

// 네트워크 생성 (Map(index, array[]))
for(let i=0; i<input.length; i++){
    let [key, value] = input[i].split(/\s/).map(Number);
    map.has(key) ? map.get(key).push(value) : map.set(key, [value]);
    map.has(value) ? map.get(value).push(key) : map.set(value, [key]);
}

// BFS 방식으로 순회하며 감염된 노드 수 계산
const queue = [1];
infection[1] = true;
let infectedCount = 0;

while(queue.length > 0){
    let current = queue.shift();
    map.get(current)?.forEach(node => {
        if(!infection[node]){
            infection[node] = true;
            infectedCount++;
            queue.push(node);
        }
    });
}

console.log(infectedCount);