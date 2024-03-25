// import java.util.stream.*;
class Solution {
    public int solution(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        return count;
        
        // 스트림 활용한 풀이 방법
        // return (int)IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count()
    }
}