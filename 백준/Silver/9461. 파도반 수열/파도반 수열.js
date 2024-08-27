const input = require('fs').readFileSync('/dev/stdin').toString().trim().split("\n");
let testcase = +input.shift();
const output = [];

const getNumber = (n) => {
    const arr = Array.from({length : n+1}, (_,i) => i<4 ? 1 : 0);
    for(let i=4; i<arr.length; i++){
        arr[i] = arr[i-2] + arr[i-3];
    }
    return arr[n];
}

while(testcase--){
    output.push(getNumber(+input.shift()));
}
console.log(output.join("\n"));