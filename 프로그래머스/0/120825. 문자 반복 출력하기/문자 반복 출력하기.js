function solution(my_string, n) {
    const res = [];
    [...my_string].forEach(s => {
        for(let i=0; i<n; i++){
            res.push(s);
        }
    });
    return res.join("");
}