// 성능비교하기
// import java.util.*;

// class Solution {
//     static int cnt;
//     static final char[] dic = {'A','E','I','O','U'};
    
//     public int solution(String word) {
//         Map<String, Integer> map = new HashMap<>();
        
//         dfs(map, "", 0);
        
//         return map.get(word);
//     }
    
//     public static void dfs(Map<String, Integer> map,String s, int depth){
//         // 탈출조건
//         if(depth >= dic.length) return;
        
//         for(int i = 0; i < dic.length; i++){
//             if(!map.containsKey(s+dic[i])){
//                 String now = s + dic[i];
//                 map.put(now, ++cnt);
//                 dfs(map, now, depth + 1);
//             }
//         }
//     }
// }

import java.util.*;

class Solution {
    static int cnt;
    static final char[] dic = {'A','E','I','O','U'};
    
    public int solution(String word) {
        List<String> list = new ArrayList<>();
        list.add("init");
        dfs(list, word, "", 0);
        
        return cnt;
    }
    
    public static void dfs(List<String> list, String word, String s, int depth){
        // 탈출조건
        if(depth >= dic.length) return;
        
        for(int i = 0; i < dic.length; i++){
            if(!word.equals(list.get(cnt))){
                String now = s + dic[i];
                list.add(now);
                ++cnt;
                dfs(list, word, now, depth + 1);
            }
            
        }
    }
}