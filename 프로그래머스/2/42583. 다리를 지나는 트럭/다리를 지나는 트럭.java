import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int total = 0;
        int checksum = 0;
        
        Queue<Integer> ready = new LinkedList<>();
        Queue<Integer> now = new LinkedList<>();
        
        // 레디 큐 초기화 + 총 무게 계산(종료조건)
        for(int i : truck_weights) {
            ready.offer(i);
            total += i;
        }
        
        // 현재 다리 중량
        int w = 0;
        
        do{
            if(now.size() == bridge_length){
                w -= now.peek();
                checksum += now.poll();
                
                // 종료 조건
                if(total == checksum && w == 0) break;    
            }
            
            // 다리 중량제한 검사 + 다리 위로 이동
            if(!ready.isEmpty()){
                if(w + ready.peek() <= weight){
                    w += ready.peek();
                    now.offer(ready.poll());
                }else 
                    now.offer(0);
            }else
                now.offer(0);
            
            // 매 동장이 일어날 때 시간 1초 증가;
            time++;
        }while (true);
        
        // 다리 위의 마지막 트럭이 통과하는 시간 추가
        time++;
        return time;
    }
}