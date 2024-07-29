const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
}).on('close', function () {
    const n = +input[0];
    let res = "";
    for(let i=0; i<n; i++){
        for(let j=0; j<=i; j++){
            res += "*"
        }
        console.log(res);
        res = "";
    }
});