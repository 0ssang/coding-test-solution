import java.util.*;
class Solution {
    public String solution(String[] parti, String[] comp) {
        Map<String, Integer> map = new HashMap<>();
        // 해시맵에 참가자 명단 업데이트
        for(String name : parti){
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        // 완주자 명단에 들어 있으면 값 -1
        for(String name : comp){
            map.put(name, map.get(name) - 1);
        }
        // 해시맵 검색하여 0보다 큰 값이 있으면 return
        String res = "";
        Set<String> keys = map.keySet();
        for(String key : keys){
            if(map.get(key) > 0)res = key;
        }
        return res;
    }
}