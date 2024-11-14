const fs = require('fs');
const input = fs.readFileSync('/dev/stdin').toString().trim().split("\n");

const results = [];

input.forEach(line => {
    if (line === "#") return;
    
    const count = line.replace(/[^aeiouAEIOU]/g, "").length;
    results.push(count);
});

console.log(results.join('\n'));