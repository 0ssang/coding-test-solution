function solution(array, commands) {
    const ret = [];
    while(commands.length > 0){
        const [s, e, k] = commands.shift();
        const newArr = array.slice(s-1, e).sort((a, b) => a - b)
        ret.push(newArr[k-1]);
    }

    return ret;
}