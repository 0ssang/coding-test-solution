import java.util.*;
class Solution {
    public int solution(int[] p, int l) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int rank = 1;
        
        for (int j : p)
            pq.add(j);

        while(!pq.isEmpty()){
            for(int i=0; i<p.length; i++){
                if(p[i] == pq.peek()){
                    if(i == l)
                        return rank;
                    pq.poll();
                    rank++;
                }
            }
        }
        return rank;
    }
}