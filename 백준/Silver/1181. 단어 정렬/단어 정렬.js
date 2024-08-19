const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').slice(1);

const solution = (input) => {
    return [...new Set(input)].sort((a, b) => {
        return a.length === b.length ? a.localeCompare(b) : a.length - b.length
    }).join("\n");
}

console.log(solution(input));