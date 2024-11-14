const input = require('fs').readFileSync('/dev/stdin').toString().trim().split("\n");
input.pop();
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

    console.log(isPalindrome ? "yes" : "no");
});