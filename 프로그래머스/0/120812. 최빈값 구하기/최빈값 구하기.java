import java.util.*;
class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int count = 0;
        int result = 0;
        for(int e : array){
            map.put(e, map.getOrDefault(e, 0) + 1);
        }
        
        Set<Integer> keys = map.keySet();
        for(Integer key : keys){
            int val = map.get(key);
            if(val > max){
                max = val;
                count = 1;
                result = key;
            }else if(val == max) {
                count++;
            }
        }
        
        return count == 1 ? result : -1;
    }
}