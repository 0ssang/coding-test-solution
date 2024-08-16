const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n').map(Number);
const divisors = [];
const output = [];
for(let i=0; i<input.length-1; i++){
    for(let j=1; j<input[i]; j++){
        if(input[i] % j === 0) divisors.push(j);
    }
    const sum = divisors.reduce((acc, cur) => cur+acc, 0);
    if(sum === input[i]){
        output.push(`${input[i]} = ${divisors.join(" + ")}`);
    }else {
        output.push(`${input[i]} is NOT perfect.`);
    }
    divisors.length = 0;
}

console.log(output.join("\n"));