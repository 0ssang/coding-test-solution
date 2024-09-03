const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
const input = require('fs').readFileSync(path).toString().trim().split(/\r?\n/);
const N = +input.shift();
let A = input.shift().split(/\s/).map(Number);
const M = +input.shift();
const targets = input.shift().split(/\s/).map(Number);
const output = [];
const bs = target =>{
    let lo = 0
    let hi = A.length - 1
    while(lo <= hi){
        let mid = Math.floor((lo + hi) / 2)
        if(A[mid] === target){
            return 1
        }else if(A[mid] > target){
            hi = mid - 1
        }else{
            lo = mid + 1
        }
    }
    return 0
}

A = A.sort((a, b) => a - b)
targets.forEach((e) => {
    output.push(bs(e))
})
console.log(output.join("\n"));