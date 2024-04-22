import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String name : participant){
            map.put(name, map.getOrDefault(name, 0) +1);
        }
        for(String name : completion){
            map.put(name, map.get(name) -1);
        }
        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            if(entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}