import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        if(K == 0) return answer;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : scoville){
            pq.offer(i);
        }
        
        while(!pq.isEmpty()){
            int min = pq.poll();
            if(min >= K) return answer;
            
            if(pq.isEmpty()) return -1;
            pq.offer(min + pq.poll() * 2);
            answer++;
        }
    
        return -1;
    }
}