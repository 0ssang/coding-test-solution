const input = require('fs').readFileSync('/dev/stdin').toString().trim();
const arr = [];
for(let i=97; i<=122; i++){
    arr.push(input.indexOf(String.fromCharCode(i)));
}
console.log(arr.join(" "));