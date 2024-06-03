class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(0,s));
        String str = my_string.substring(s,e+1);
        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        sb.append(my_string.substring(e+1));
        return sb.toString();
    }
}