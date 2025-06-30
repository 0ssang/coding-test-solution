class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = 0;
        if(num_list.length % n == 0) {
            size = num_list.length / n;
        } else {
            size = num_list.length / n + 1;
        }
        
        int[] answer = new int[size];
        answer[0] = num_list[0];
        int cur = 0;
        for(int i=1; i<num_list.length; i++){
            if(i % n == 0){
                cur++;
                answer[cur] = num_list[i];
            }
        }
        
        return answer;
    }
}