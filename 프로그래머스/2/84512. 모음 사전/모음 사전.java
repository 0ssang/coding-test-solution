import java.util.*;

class Solution {
    static int cnt;
    static final char[] dic = {'A','E','I','O','U'};
    
    public int solution(String word) {
        Map<String, Integer> map = new HashMap<>();
        
        dfs(map, "", 0);
        
        return map.get(word);
    }
    
    public static void dfs(Map<String, Integer> map, String s, int depth){
        // 탈출조건
        if(depth >= dic.length) return;
        
        for(int i = 0; i < dic.length; i++){
            String now = s + dic[i];
            map.put(now, ++cnt);
            dfs(map, now, depth + 1);
        }
    }
}