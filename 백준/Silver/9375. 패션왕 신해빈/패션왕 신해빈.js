const input = require('fs').readFileSync('/dev/stdin').toString().trim().split("\n");
let testcase = +input.shift();
const answer = [];

while(testcase > 0){
    const map = new Map();
    let n = +input.shift();

    for(let i=0; i<n; i++){
        let [val, key] = input.shift().split(/\s/);
        map.has(key) ? map.get(key).push(val) : map.set(key, [val]);
    }

    let combination = 1;
    map.forEach((val) => {
        combination *= val.length + 1;
    });

    answer.push(--combination);
    testcase--;
}
console.log(answer.join("\n"));