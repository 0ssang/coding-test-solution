class Solution {
    public int solution(int n) {
        int res = 1;
        int i = 1;
        while(res <= n){
            res *= i;
            i++;
        }
        return i-2;
    }
}