let [n, ...input] = require('fs').readFileSync('/dev/stdin').toString().trim().split("\n");
input = input.map(Number);

const arr = [0];
arr[1] = 1;
arr[2] = 2;
arr[3] = 4;

for(let i=4; i<=Math.max(...input); i++){
    arr[i] = arr[i-3] + arr[i-2] + arr[i-1];
}
input.forEach(val => {
    console.log(arr[val]);
});