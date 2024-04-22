import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int max = nums.length/2;
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }
        if(hs.size() > max){
            return max;
        }else{
            return hs.size();
        }
        
    }
}