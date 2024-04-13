import java.util.*;

class Solution {
    public int solution(int[] num) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < num.length - 1; i++){
            for(int j = i + 1; j < num.length; j++){
                if(num[i] * num[j] > max){
                    max = num[i] * num[j];
                }
            }
        }
        return max;
    }
}