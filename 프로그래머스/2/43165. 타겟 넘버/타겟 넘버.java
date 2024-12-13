import java.util.*;

class Solution {    
    public int solution(int[] numbers, int target){
        int answer = 0;
        int start = 0;
        
        Deque<Integer> q = new ArrayDeque<>();
        q.add(start);
        
        for(int num : numbers){
            int len = q.size();
            
            for(int i=0; i<len; i++){
                int val = q.remove();
                q.add(val + num);
                q.add(val - num);
            }
        }
        
        while(!q.isEmpty()){
            int val = q.remove();
            if(val == target){
                answer += 1;
            }
        }
        
        return answer;
    }
}