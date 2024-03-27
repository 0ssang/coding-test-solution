import java.util.*;
class Solution {
    public int solution(int n) {
        // 합성수의 개수 = n - 소수의 개수
        // 소수 구하는 알고리즘 : 에라토스테네스의 체
        int cnt = 0;
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        
        // 0과 1은 소수가 아님
        isPrime[0] = isPrime[1] = false;
        
        for(int i=2; i*i<=n; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        // 합성수 카운트
        for(int i=2; i<=n; i++){
            if(!isPrime[i]) cnt++;
        }
        
        return cnt;
    }
}