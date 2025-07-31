import java.util.*;

class Solution {
    public String solution(String str) {
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != '0')
                return str.substring(i);
        }
        return "";
    }
}