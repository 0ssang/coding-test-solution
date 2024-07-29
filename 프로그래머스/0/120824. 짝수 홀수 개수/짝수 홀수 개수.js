function solution(num_list) {
    const answer =[];
    answer.push(num_list.filter(x => x%2 === 0).length);
    answer.push(num_list.length - answer[0]);
    return answer;
}