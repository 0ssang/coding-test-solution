const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const [N, M] = input.shift().split(" ").map(Number);
const neverHeard = input.slice(0, N);
const neverSeen = input.slice(N);

const set = new Set(neverHeard);
const answer = [];

neverSeen.forEach(val => {
    if(set.has(val)) answer.push(val);
});
console.log(`${answer.length}\n${answer.sort().join("\n")}`);