import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        int target = 0;
        for(int i=1; i<64; i++){
            int binary = Integer.parseInt(Integer.toBinaryString(i));
            target = binary * 5;            
            if(target >= l && target <= r) {
                list.add(target);
            }
        }
        if(list.isEmpty()) return new int[]{-1};
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}