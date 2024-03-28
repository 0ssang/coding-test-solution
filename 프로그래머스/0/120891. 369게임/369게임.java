class Solution {
    public int solution(int n) {
        int cnt = 0;
        for(String s : String.valueOf(n).split(""))
            if(s.matches("[369]"))
                cnt++;
        return cnt;
    }
}