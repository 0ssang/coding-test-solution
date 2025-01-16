const data = require("fs").readFileSync("/dev/stdin").toString().trim().split("\n");
data.pop();
const result = []
for(let el of data) {
  const input = el.split(' ').map(Number);
  input.sort((a, b) => a - b);
  if(input[0] + input[1] <= input[2]) {
    result.push('Invalid');
    continue;
  }
  const set = new Set(input);
  if(set.size === 1) {
    result.push('Equilateral');
  } else if(set.size === 2) {
    result.push('Isosceles');
  } else {
    result.push('Scalene');
  } 
}
console.log(result.join('\n'));