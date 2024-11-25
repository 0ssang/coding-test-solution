const path = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = require('fs').readFileSync(path).toString().trim().split("\n");
const tc = +input[0];
const answer = [];
for (let i = 1; i <= tc; i++) {
    const [N, targetIdx] = input[2 * i - 1].split(" ").map(Number);
    const queue = input[2 * i].split(" ").map((val, idx) => {
        if (idx === targetIdx) {
            return [+val, true];
        } else {
            return [+val, false];
        }
    });
    let cnt = 1;

    const prior = Array.from({ length: 10 }, () => 0);
    queue.forEach((val) => prior[val[0]] += 1);

    while (true) {
        let goBack = false;
        const data = queue.shift();

        for (let idx = data[0]; idx < prior.length - 1; idx++) {
            if (prior[idx + 1] > 0) {
                goBack = true;
                break;
            }
        }

        if (goBack) {
            queue.push(data);
        } else {
            if (data[1]) {
                answer.push(cnt);
                break;
            } else {
                prior[data[0]] -= 1;
                cnt += 1;
            }
        }
    }
}
console.log(answer.join("\n"));