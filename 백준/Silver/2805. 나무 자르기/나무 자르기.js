const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
const input = require('fs').readFileSync(path).toString().trim().split(/\r?\n/);
let [num, target] = input[0].split(" ").map(Number)
let tree = input[1].split(" ").map(Number)

let lo = 1
let hi = Math.max(...tree)
let answer = 0
while(lo <= hi){
    let mid = Math.floor((lo + hi) / 2)
    let sum = 0
    for(const x of tree){
        sum += Math.max(0, x - mid)
    }

    if(sum >= target){
        answer = mid
        lo = mid + 1
    }else{
        hi = mid - 1
    }
}
console.log(answer)