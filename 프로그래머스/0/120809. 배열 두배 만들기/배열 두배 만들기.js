function solution(numbers) {
    // map 사용
    //return numbers.map(i => i*2);
    
    // reduce 사용
    return numbers.reduce((x, y) => ([...x, y*2]), []);
}