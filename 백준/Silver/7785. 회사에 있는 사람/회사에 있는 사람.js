const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').slice(1);
const set = new Set();

input.forEach( val => {
    let [name, status] = val.split(" ");
    if(status === "enter") set.add(name);
    else if (status === "leave") set.delete(name);
});

console.log([...set].sort((a, b) => b > a ? 1 : -1).join("\n"));