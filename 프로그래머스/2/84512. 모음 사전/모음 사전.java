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
    static List<String> list = new ArrayList<>();
    public int solution(String word) {
        list.add("init");
        dfs(word, "", 0);
        
        return cnt;
    }
    
    public static void dfs(String word, String s, int depth){
        // 탈출조건
        if(depth >= dic.length) return;
        
        for(int i = 0; i < dic.length; i++){
            if(!word.equals(list.get(cnt))){
                String now = s + dic[i];
                list.add(now);
                ++cnt;
                dfs(word, now, depth + 1);
            }
            
        }
    }
}