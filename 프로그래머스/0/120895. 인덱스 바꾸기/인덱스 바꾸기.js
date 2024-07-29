function solution(my_string, num1, num2) {
    const strs = [...my_string];
    [strs[num1], strs[num2]] = [strs[num2], strs[num1]];
    return strs.join("");
}