const input = require('fs').readFileSync('/dev/stdin').toString().trim().split("\n");
let testcase = +input.shift();
const answer = [];
const map = new Map();
let combination = 1;

while(testcase > 0){
    let n = +input.shift();

    for(let i=0; i<n; i++){
        let [val, key] = input.shift().split(/\s/);
        map.has(key) ? map.get(key).push(val) : map.set(key, [val]);
    }
    map.forEach((val) => {
        combination *= val.length + 1;
    });

    answer.push(--combination);
    map.clear();
    combination = 1;
    testcase--;
}
console.log(answer.join("\n"));