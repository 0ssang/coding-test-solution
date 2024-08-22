const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const arr = input[1].split(" ").map(Number);
const search = input[3].split(" ").map(Number);
const map = new Map();
const answer = [];

arr.forEach(val => {
    if(map.has(val)){
        map.set(val, map.get(val) + 1);
    }else {
        map.set(val, 1);
    }
});

search.forEach(val => {
    if(map.has(val)){
        answer.push(map.get(val));
    }else {
        answer.push(0);
    }
});

console.log(answer.join(" "));