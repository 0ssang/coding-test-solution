const input = require('fs').readFileSync('/dev/stdin').toString();
const num = +input;
for(let i=1; i< 10; i++){
    console.log(`${num} * ${i} = ${num * i}`);
}