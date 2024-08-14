const input = require('fs').readFileSync('/dev/stdin').toString().trim().split('\n');
const set = new Set();
let count = +input[0];
for(let i=1; i<=Number(input[0]); i++){
    let str = input[i].split('');
    for(let j=0; j<str.length; j++){
        // 1.셋에 있는지 검사
        // 2.셋에 없으면 추가
        // 3.셋에 있으면
        // 3-1. 이전 값이랑 같으면 pass
        // 3-2. 이전 값이랑 다르면 count-1 , break
        if(set.has(str[j])){
            if(str[j] !== str[j-1]){
                count--;
                break;
            }
        }else {
            set.add(str[j]);
        }
    }
    set.clear();
}
console.log(count);