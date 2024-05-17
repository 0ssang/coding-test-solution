import java.util.*;
class Solution {
    static Set<Integer> set = new HashSet<>();
    static boolean[] visited = new boolean[7];
    
    public int solution(String str) {
        int answer = 0;
        dfs(str, "", 0);
        for(Integer num : set){
            if(isPrime(num)) answer++;
        }
        
        return answer;
    }
    
    static void dfs(String numbers, String s, int depth){
        // depth 가 numbers.length() 이상이면 return;
        if(depth > numbers.length()) return;
        
        for(int i = 0; i < numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                set.add(Integer.parseInt(s + numbers.charAt(i)));
                dfs(numbers, s + numbers.charAt(i), depth+1);
                visited[i] = false;
            }
        }
    }
     // 소수를 판별하는 메서드
    static boolean isPrime(int x){
        // 소수는 자기 자신과 1로만 나누어진다.
        if(x == 1 || x == 0) return false;
        for(int i = 2; i <= (int)Math.sqrt(x); i++){
            if(x % i == 0) return false;
        }
        return true;
    }
}