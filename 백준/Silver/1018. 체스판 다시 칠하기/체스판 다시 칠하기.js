const input = require('fs').readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt").toString().trim().split("\n");
const [N, M] = input[0].split(" ").map(Number);
const board = input.slice(1).map(line => line.split(""));

const res = [];

function search(y, x, startColor) {
    let count = 0;

    for (let j = 0; j < 8; j++) {
        for (let i = 0; i < 8; i++) {
            const expectedColor = (j + i) % 2 === 0 ? startColor : (startColor === 'W' ? 'B' : 'W');
            if (board[y + j][x + i] !== expectedColor) {
                count++;
            }
        }
    }

    return count;
}

for (let j = 0; j <= N - 8; j++) {
    for (let i = 0; i <= M - 8; i++) {
        res.push(search(j, i, 'W'));
        res.push(search(j, i, 'B'));
    }
}

console.log(Math.min(...res));