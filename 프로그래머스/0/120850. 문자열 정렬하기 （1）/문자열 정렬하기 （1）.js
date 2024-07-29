function solution(my_string) {
    const arr = [...my_string];
    return arr.filter( x => Number(x) || x === "0").map(x => +x).sort();
}