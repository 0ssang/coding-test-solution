const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let input = [];
rl.on("line", (line) => {
    input = line.split(" ").map(el => parseInt(el));
    console.log(input[0] + input[1]);
    console.log(input[0] - input[1]);
    console.log(input[0] * input[1]);
    console.log(Math.floor(input[0] / input[1]));
    console.log(input[0] % input[1]);
    process.exit();
});