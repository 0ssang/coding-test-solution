const fs = require("fs");
const arr = fs.readFileSync("/dev/stdin").toString().trim().split(/\r?\n/).map((d) => d.split(" ").map((d) => parseInt(d)));

const xArr = arr.map((d) => d[0]).sort();
const yArr = arr.map((d) => d[1]).sort();
const x = xArr[0] === xArr[1] ? xArr[2] : xArr[0];
const y = yArr[0] === yArr[1] ? yArr[2] : yArr[0];
console.log(`${x} ${y}`);