const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').slice(1).map(e => e.split(' ').map(Number));

const solution = (input) =>{
    return input.sort((a, b) => {
        if(a[0] === b[0]){
            return a[1] - b[1];
        }
        return a[0] - b[0];
    }).map(e => e.join(' ')).join("\n");
}

console.log(solution(input));