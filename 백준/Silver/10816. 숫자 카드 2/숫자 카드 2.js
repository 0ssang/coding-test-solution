const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const arr = input[1].split(" ").map(Number);
const search = input[3].split(" ").map(Number);
const map = new Map();


arr.forEach(val => {
    if(map.has(val)){
        map.set(val, map.get(val) + 1);
    }else {
        map.set(val, 1);
    }
});

const answer = search.map(val => map.get(val) | 0);
console.log(answer.join(" "));