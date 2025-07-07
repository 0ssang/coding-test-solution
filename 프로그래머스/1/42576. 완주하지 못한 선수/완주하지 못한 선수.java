import java.util.*;
class Solution {
    public String solution(String[] parti, String[] comp) {
        Map<String,Integer> map = new HashMap<>();
        
        for(String name : parti){
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        for(String name : comp){
            if(map.get(name) > 1){
                map.put(name, map.get(name) - 1);
            } else {
                map.remove(name);
            }
        }
        
        return map.keySet().iterator().next();
    }
}