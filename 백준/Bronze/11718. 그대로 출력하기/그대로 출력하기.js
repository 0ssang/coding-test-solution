const input = require('fs').readFileSync('/dev/stdin').toString().trim().split("\n").map(e => e.trim());
const output = [];
input.forEach((e) => {
    output.push(e);
});
console.log(output.join('\n'));