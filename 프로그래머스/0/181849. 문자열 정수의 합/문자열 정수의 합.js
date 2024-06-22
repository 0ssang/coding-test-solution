function solution(num_str) {
    let sum = 0;
    num_str.split("").map(i => sum += +i);
    return sum;
}