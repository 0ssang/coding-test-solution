import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int k = 2;
        int g = gcd(a, b);
        int denom = b / g;
        List<Integer> list = new ArrayList<>();
        // a / b 가 유한소수인지 무한소수인지 판별
        // 유한소수로 판별하려면...
        //      기약분수로 변환한다.
        //      -> 분모의 소인수가 2와 5만 존재한다.
        // 기약분수로 변환하는 방법
        //      분자와 분모의 공약수가 1뿐이여서 더이상 약분되지 않는 분수
        //      최대공약수를 구한다.
        //      -> 유클리드 호제법 사용
        
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