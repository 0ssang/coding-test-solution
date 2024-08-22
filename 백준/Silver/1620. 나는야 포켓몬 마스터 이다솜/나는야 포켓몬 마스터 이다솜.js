const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const [N, M] = input.shift().split(" ").map(Number);

const dictionary = input.slice(0,N);
const questions = input.slice(N);
const map = new Map();
let output = "";

// 번호가 주어지면 배열의 인덱스로 검색, 이름이 주어지면 맵의 키로 검색

dictionary.forEach((poketmon, idx) => {
    map.set(poketmon, idx + 1);
});

questions.forEach((val) => {
    // 문자열이면 +val이 NaN(false) 반환.
    if(+val){
        output += dictionary[val-1]+"\n";
    }else {
        output += map.get(val)+"\n";
    }
});
console.log(output.trimEnd());