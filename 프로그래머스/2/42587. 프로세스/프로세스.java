import java.util.*;
class Solution {
    public int solution(int[] p, int l) {
        int rank = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int j : p) {
            pq.add(j);
        }

        while(!pq.isEmpty()){
            for(int i=0; i<p.length; i++){
                if(p[i] == pq.peek()){
                    if(i == l){
                        return rank;
                    }
                    pq.poll();
                    rank++;
                }
            }
        }
        return rank;
    }
}