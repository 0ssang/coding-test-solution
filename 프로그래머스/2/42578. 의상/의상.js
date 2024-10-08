function solution(clothes) {
    let res = 1;
    const map = new Map();
    for(let i=0; i<clothes.length; i++){
        const key = clothes[i][1];
        map.set(key, (map.get(key) || 0) + 1);
    }
    
    
    map.forEach((val, key) => {
        res *= val + 1;
    });
    
    
    
    return --res;
}