class Solution {
    public int solution(int n) {
         int cnt = 0;
        for(int i = 1; i <= n; i++){
            cnt++;
            if((cnt/10)%10 == 3) cnt += 10;
            if(cnt%3 == 0 || cnt%10 == 3){
                cnt++;
                if(cnt%10 == 3 || cnt%3 == 0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}