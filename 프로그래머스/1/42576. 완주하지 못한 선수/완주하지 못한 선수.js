function solution(participant, completion) {
    let answer = '';
    const map = new Map()
    participant.forEach((e) => {
        if(map.has(e)){
            map.set(e, map.get(e) + 1)
        }else {
            map.set(e, 1)
        }
    });
    completion.forEach(e => {
        if(map.has(e)){
            if(map.get(e) === 1) map.delete(e);
            else map.set(e, map.get(e) - 1);
        }
    })

    map.forEach((val, key) => {
        if(val >= 1){
            answer = key;
        }
    })
    return answer;
}