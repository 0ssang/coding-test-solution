let input = require("fs").readFileSync("/dev/stdin").toString().split("\n");
input = input.map((e) => e.replace("\r", ""));
 
const testCase = Number(input[0]);
 
let result = "";
 
for (i = 1; i <= testCase; i++) {
  let nums = input[i].split(" ").filter(Boolean);
  nums.sort((a, b) => b - a); 
  a = nums[0]; 
  b = nums[1];
 
  while (b !== 0) {
    r = a % b;
    a = b;
    b = r;
  }
  
  let leastCM = (nums[0] * nums[1]) / a;
  result += leastCM + "\n";
}
 
console.log(result);