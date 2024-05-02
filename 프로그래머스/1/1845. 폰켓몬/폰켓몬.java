import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int half = nums.length/2;
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);
        }
        
        return set.size() < half ? set.size() : half;
    }
}