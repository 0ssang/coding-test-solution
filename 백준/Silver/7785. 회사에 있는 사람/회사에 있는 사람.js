const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').slice(1);
const map = new Map();
const result = [];

input.forEach( val => {
    let [name, status] = val.split(" ");
    map.set(name, status);
});

map.forEach((val, key) => {
    if(val === 'enter') result.push(key);
});

console.log(result.sort((a, b) => b > a ? 1 : -1).join("\n"));