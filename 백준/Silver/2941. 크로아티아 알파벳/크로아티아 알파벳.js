const input = require('fs').readFileSync('/dev/stdin').toString().trim();

const patterns = ["dz=", "z=", "s=", "c=", "c-", "d-", "lj", "nj"];
const result = patterns.reduce((acc, pattern) => acc.replaceAll(pattern, "*"), input);

console.log(result.length);