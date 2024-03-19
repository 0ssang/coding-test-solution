class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        int gcd = gcd(numer, denom);
        return new int[]{numer/gcd, denom/gcd};
    }
    int gcd(int x, int y){
        while (y != 0){
            int r = x % y;
            x = y;
            y = r;
        }
        return x;
    }
}