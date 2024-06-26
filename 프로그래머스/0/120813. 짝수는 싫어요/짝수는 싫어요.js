function solution(n) {
    const list = [];
    for(let i=1; i<=n; i++){
        if(i % 2 != 0){
            list.push(i);
        }
    }
    return list;
}