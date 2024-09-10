const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
const input = require('fs').readFileSync(filePath).toString().trim().split('\n');

const [N, M] = input.shift().split(' ').map(Number);
const maze = input.map((v) => v.split('').map(Number));
const [goalY, goalX] = [N - 1, M - 1];
const ds = [[-1, 0], [1, 0], [0, 1], [0, -1]];
// BFS
const bfs = () => {
  const queue = [[0, 0, 1]];

  while (queue.length) {
    const [curY, curX, move] = queue.shift();
    if (goalY === curY && goalX === curX) return move;

    for (let i = 0; i < 4; i++) {
      const ny = curY + ds[i][1];
      const nx = curX + ds[i][0];

      if (ny >= 0 && ny < N && nx >= 0 && nx < M && maze[ny][nx]) {
        maze[ny][nx] = 0;
        queue.push([ny, nx, move + 1]);
      }
    }
  }
};

console.log(bfs());