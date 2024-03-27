import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int i = 2;
        while(n > 1){
            if(n % i == 0){
                n /= i;
                list.add(i);
            }else{
                i++;
            }
        }
        return list.stream().mapToInt(Integer::valueOf).distinct().toArray();
    }
}