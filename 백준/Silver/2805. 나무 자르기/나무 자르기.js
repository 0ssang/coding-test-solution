const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
const input = require('fs').readFileSync(path).toString().trim().split(/\r?\n/);
let [num, target] = input[0].split(" ").map(Number)
let tree = input[1].split(" ").map(Number)

let lo = 1
let hi = Math.max(...tree)
while(lo <= hi){
    let mid = Math.floor((lo + hi) / 2)
    let sum = 0
    for(const x of tree){
        if(mid <= x) sum += x - mid
    }

    if(sum >= target){
        lo = mid + 1
    }else{
        hi = mid - 1
    }
}
console.log(hi)