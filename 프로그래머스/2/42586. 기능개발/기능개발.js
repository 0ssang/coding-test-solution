function solution(pg, sp){
    const res = [];
    pg = pg.map((val, idx) => Math.ceil( (100-val) / sp[idx] ))
    let cnt = 1;
    let max = pg[0];
    for(let i=1; i<pg.length; i++){
        if(max >= pg[i]){
            cnt++;
        }else{
            max = pg[i];
            res.push(cnt);
            cnt = 1;
        }
    }
    res.push(cnt);
    
    return res;
}