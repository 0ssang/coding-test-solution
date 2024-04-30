class Solution {
    public int solution(String A, String B) {
        int cnt = 0;
        for(int i = 0; i < A.length()-1; i++){
            if(B.equals(A)){
                // 일치하는지 체크
                return cnt;
            } else {
                // 왼쪽으로 이동하는 로직;
                String tmp = A.substring(A.length()-1);
                A = A.substring(0,A.length()-1);
                A = tmp + A;
                cnt++;
            }
        }
        return B.equals(A) ? cnt : -1;
    }
}