const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const output = [];

for(let i=0; i<input.length-1; i++){
    let nums = input[i].split(" ").map(Number);
    let check = "neither";
    if(nums[1] / nums[0] === Math.floor(nums[1] / nums[0])){
        check = "factor";
    } else if (nums[0] / nums[1] === Math.floor(nums[0] / nums[1])){
        check = "multiple";
    }
    output.push(check);
}
console.log(output.join("\n"));