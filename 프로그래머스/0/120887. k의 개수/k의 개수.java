class Solution {
    public int solution(int i, int j, int k) {
        int cnt = 0;
        for(int a = i ; a <= j; a++){
            for(String s : String.valueOf(a).split("")){
                if(s.equals(String.valueOf(k))) cnt++;
            }
        }
        return cnt;
    }
}