import java.util.*;

class Solution {
    final char[] dic = {'A', 'E', 'I', 'O', 'U'};
    int cnt = 0;
    
    public int solution(String word) {
        Map<String, Integer> map = new HashMap<>();
        dfs(map, "", 0);
        
        return map.get(word);
        
    }
    
    private void dfs(Map<String, Integer> map, String s, int depth){
        if(depth == dic.length) return;
        
        for(int i=0; i<dic.length; i++){
            if(!map.containsKey(s+dic[i])){
                String now = s+dic[i];
                map.put(now, map.getOrDefault(now, cnt) + 1);
                cnt++;
                dfs(map, now, depth+1);
            }
        }
    }
    
}