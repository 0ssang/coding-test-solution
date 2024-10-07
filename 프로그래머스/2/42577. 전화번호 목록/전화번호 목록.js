function solution(book) {
    const set = new Set(book);
    for(const num of book){
        for(let i=0; i<num.length-1; i++){
            if(set.has(num.slice(0, i+1))){
                return false;
            }
        }
    }
    return true;
}