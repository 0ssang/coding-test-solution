class Solution {
    public int solution(int num1, int num2) {
        float res = (float)num1 / (float)num2 * 1000;
        
        int answer = (int)Math.floor(res);
        return answer;
    }
}