const fs = require('fs');
const input = fs.readFileSync("./dev/stdin").toString().trim().split('\n').map(Number);

const N = input.shift();

const rope = input.sort((a,b)=>a-b);

let answer = 0;
while(rope.length>0){
  let min = rope[0];
  let L = rope.length;
  answer = min*L>answer ?  min*L : answer;
  rope.shift();
}

console.log(answer)