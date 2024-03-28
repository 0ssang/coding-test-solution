class Solution {
    public String solution(String s, int c) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<chars.length; i++)
            if((i+1) % c == 0)
                sb.append(chars[i]);
        
        return sb.toString();
    }
}