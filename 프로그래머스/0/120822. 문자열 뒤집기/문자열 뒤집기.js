function solution(my_string) {
    return [...my_string].reduceRight((x, y) => x+y);
}