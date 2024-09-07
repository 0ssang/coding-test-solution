const path = process.platform === 'linux' ? '/dev/stdin' : 'stdin.txt';
const [N,...input] = require('fs').readFileSync(path).toString().trim().split(/\r?\n/);
const time = input.map(row => row.split(/\s/).map(Number))
time.sort((a, b) => a[1] - b[1] || a[0] - b[0])

let count = 0
let lastEnd = 0

for(let i=0; i<time.length; i++){
    const[start, end] = time[i]
    if(start >= lastEnd){
        lastEnd = end
        count += 1
    }
}
console.log(count)