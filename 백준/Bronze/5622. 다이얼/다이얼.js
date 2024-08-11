let input = require("fs").readFileSync(0, "utf-8").toString().split('');
let charMap = {};
let charStack = '';
let counter = 3;

for (let i = 'A'.charCodeAt(0); i <= 'Z'.charCodeAt(); i++) {
    charStack += String.fromCharCode(i);

    if(
        charStack.length === 3 &&
        i !== 'R'.charCodeAt(0) && 
        i !== 'Y'.charCodeAt(0)
    ) {
        charMap[charStack] = counter;
        counter++;
        charStack = ''
    } else if (charStack.length === 4) {
        charMap[charStack] = counter;
        counter++;
        charStack=''
    }
}

let result = input.reduce((acc,char) => {
    for (let stage in charMap) {
        if(stage.includes(char)) {
            acc += charMap[stage];
        }
    }
    return acc;
},0)

console.log(result);