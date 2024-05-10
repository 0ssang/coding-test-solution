import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int res = 1;
        Map<String, Integer> map = new HashMap<>();
        for(String[] cloth : clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }
        Set<String> keys = map.keySet();
        for(String key : keys){
            res *= map.get(key)+1;
        }
        
        return res - 1;
    }
}