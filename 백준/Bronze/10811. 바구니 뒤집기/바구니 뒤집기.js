const fs = require('fs');
const filePath = process.platform === 'linux' ? '/dev/stdin' : './input.txt';
let input = fs.readFileSync(filePath).toString().split('\n');

const [N, M] = input[0].split(' ').map((item) => +item);
let arr = new Array(N).fill(1).map((a, b) => a + b);    // 1 2 3 4 5

for (let i = 1; i <= M; i++) {
    let [a, b] = input[i].split(' ').map((item) => +item);
   
    let tmpArr = [];

    for (let j = a; j <= b; j++) tmpArr.push(arr[j - 1]);     // 바구니 안의 a 부터 b까지의 범위를 tmpArr 에 넣기

    tmpArr.reverse();     // 반전시키기

    arr.splice(a - 1, tmpArr.length,...tmpArr);     // arr.splice(어디서부터, 없앨 개수, 없애고 가져올 것);

}

console.log(arr.join(' '));