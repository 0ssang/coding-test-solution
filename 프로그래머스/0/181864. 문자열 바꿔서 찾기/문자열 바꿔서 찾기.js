function solution(my, pat){
    let arr = my.split("");
    for(let i=0; i<arr.length; i++){
        if(arr[i] === "A"){
            arr[i] = "B";
        }else if(arr[i] === "B"){
            arr[i] = "A";
        }
    }
    // console.log(arr.toString().replaceAll(",", ""));
    my = arr.join('');
    if(my.includes(pat)){
        return 1;
    }
    return 0;
}