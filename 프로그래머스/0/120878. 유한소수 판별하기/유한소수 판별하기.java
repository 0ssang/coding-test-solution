import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int k = 2;
        int g = gcd(a, b);
        int denom = b / g;
        List<Integer> list = new ArrayList<>();
        
        while(denom != 1){
            if(denom % k == 0){
                list.add(k);
                denom /= k;
            }else {
                k++;
            }
        }
        
        for(int i : list){
            if(i != 2 && i != 5){
                return 2;
            }
        }
        return 1;
    }
    
    public static int gcd(int a, int b){
        return b > 0 ? gcd(b, a%b) : a;
    }
}