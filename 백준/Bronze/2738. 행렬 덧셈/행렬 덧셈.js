let input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n')
let [N,M] = input[0].split(' ').map(Number);
 
for(let i=1; i<=N; i++){
  let a = input[i].split(' ').map(Number)
  let b = input[i+N].split(' ').map(Number)
  
  console.log(a.map((x,y) => x + b[y]).join(' '))
};