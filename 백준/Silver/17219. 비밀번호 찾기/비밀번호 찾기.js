const input = require('fs').readFileSync('/dev/stdin').toString().trim().split("\n");
const N = input.shift().split(/\s/).shift();
const sites = input.slice(0, +N);
const search = input.slice(+N);
const map = new Map();

sites.forEach(str => {
    let [site, pw] = str.split(/\s/);
    map.set(site, pw);
});

console.log(search.map(val => map.get(val)).join("\n"));