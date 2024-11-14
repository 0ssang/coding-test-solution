const input = require('fs').readFileSync('/dev/stdin').toString().trim().split("\n");
input.pop();
input.forEach(str => {
    const reversed = [...str].reverse().join('');
    if(reversed === str) console.log("yes");
    else console.log("no");
});