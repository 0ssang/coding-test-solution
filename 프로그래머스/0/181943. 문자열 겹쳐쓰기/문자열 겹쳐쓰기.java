class Solution {
    public String solution(String my, String over, int s) {
        String answer = "";
        answer = my.substring(0,s) + over + my.substring(over.length()+s);
        return answer;
    }
}