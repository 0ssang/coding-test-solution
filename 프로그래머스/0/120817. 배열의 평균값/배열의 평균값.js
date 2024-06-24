function solution(numbers) {
    // let sum = 0;
    // for(const element of numbers){
    //     sum += element;
    // }
    // return sum / numbers.length;
    return numbers.reduce((a, b) => a+b, 0) / numbers.length;
}