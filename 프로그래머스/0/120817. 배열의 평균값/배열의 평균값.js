function solution(numbers) {
    let sum = 0;
    for(const element of numbers){
        sum += element;
    }
    return sum / numbers.length;
}