class Solution {
    public String solution(String str) {
        StringBuilder sb = new StringBuilder();
        for(String s : str.split("")){
            if(s.charAt(0) >= 'a')
                sb.append(s.toUpperCase());
            else 
                sb.append(s.toLowerCase());
        }
        return sb.toString();
    }
}