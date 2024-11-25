const input = require('fs')
    .readFileSync(process.platform === "linux" ? "/dev/stdin" : "./input.txt")
    .toString()
    .trim()
    .split('\n');

const num = Number(input.shift());
const answer = [];
for (let i = 0; i < num; i++) {
    let pos = Number(input.shift().split(' ')[1]);
    let cnt = 1;
    const queue = input.shift().split(' ').map(Number);

    while (true) {
        const max = Math.max(...queue);
        const cur = queue.shift();
        if (max === cur && pos === 0) {
            answer.push(cnt);
            break;
        } else if (max > cur) {
            queue.push(cur);
            pos = pos - 1 < 0 ? queue.length - 1 : pos - 1;
        } else {
            cnt++;
            pos--;
        }
    }
}
console.log(answer.join("\n"));