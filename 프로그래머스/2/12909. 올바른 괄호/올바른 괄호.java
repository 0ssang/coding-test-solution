import java.util.*;
class Solution {
    boolean solution(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> st = new Stack<>();
        for(char c : chars){
            if(st.isEmpty() || !(st.peek() == '(' && c == ')')){
                st.push(c);
            } else {
                st.pop();
            }
        }
        return st.isEmpty();
    }
}