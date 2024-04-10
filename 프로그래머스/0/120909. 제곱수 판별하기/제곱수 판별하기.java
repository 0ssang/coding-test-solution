class Solution {
    public int solution(int n) {
         int i = n;
        boolean check = false;
        while(i > 0){
            if(i * i == n){
                check = true;
                break;
            }
            i--;
        }
        return check? 1:2;
    }
}