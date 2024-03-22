class Solution {
    public int solution(int n, int k) {
        int cnt = n / 10;
        return n * 12000 + (k - cnt) * 2000;
    }
}