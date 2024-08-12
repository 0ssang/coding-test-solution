const [n, input] = require('fs')
                    .readFileSync('/dev/stdin')
                    .toString()
                    .trim()
                    .split('\n');
const sum = input
            .split('')
            .reduce((acc, cur) => acc += Number(cur), 0);
console.log(sum);