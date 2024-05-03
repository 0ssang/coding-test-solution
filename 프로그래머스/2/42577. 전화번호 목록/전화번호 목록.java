import java.util.*;

class Solution {
    public boolean solution(String[] pb) {
        // 1. HashSet을 선언한다.
        Set<String> set = new HashSet<>();

        // 2. 모든 전화번호를 HashSet에 넣는다.
        for(String s : pb){
            set.add(s);
        }
        
        // 3. 모든 전화번호의 substring이 HashSet에 존재하는지 확인한다.
        for(String s : pb){
            for(int i = 0; i < s.length(); i++){
                if(set.contains(s.substring(0, i)))
                    return false;
            }
        }

        return true;
    }
}