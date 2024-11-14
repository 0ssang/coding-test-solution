const input = require('fs').readFileSync('/dev/stdin').toString().trim().split("\n");
input.pop();

const results = [];  // 결과를 누적할 배열

input.forEach(str => {
    let isPalindrome = true;
    let start = 0;
    let end = str.length - 1;

    while (start < end) {
        if (str[start] !== str[end]) {
            isPalindrome = false;
            break;
        }
        start++;
        end--;
    }

    results.push(isPalindrome ? "yes" : "no");
});

console.log(results.join('\n'));  // 한 번에 출력
