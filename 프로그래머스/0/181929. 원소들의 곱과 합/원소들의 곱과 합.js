function solution(num_list) {
    let sum = 0;
    let com = 1;
    for(let e of num_list){
        sum += e;
        com *= e;
    }
    return sum*sum > com ? 1 : 0;
}