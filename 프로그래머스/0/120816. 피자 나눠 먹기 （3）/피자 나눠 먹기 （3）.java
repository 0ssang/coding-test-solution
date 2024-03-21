class Solution {
    public int solution(int slice, int n) {
        int res = 0;
        for(int i = 1; i <= n ; i++){
            if(i * slice >= n){
                res = i;
                break;
            }
        }
        return res;
    }
}