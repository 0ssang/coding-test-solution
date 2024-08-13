const fs = require('fs');
const str = fs.readFileSync('/dev/stdin').toString().trim();
const uStr = str.toUpperCase();
const arr = new Array(26).fill(0);

for (let i = 0; i < uStr.length; i++) {
    arr[uStr[i].charCodeAt(0) - 65]++;
}

const maxNum = Math.max(...arr);
const countMax = arr.filter(e => e === maxNum).length;

// 최대값이 중복되는지 여부를 체크
if (countMax > 1) {
    console.log("?");
} else {
    // 최대값을 가지는 인덱스를 문자로 변환
    const maxIndex = arr.indexOf(maxNum);
    console.log(String.fromCharCode(maxIndex + 65));
}