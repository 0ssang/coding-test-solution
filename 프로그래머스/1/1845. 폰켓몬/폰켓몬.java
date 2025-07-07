import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] nums) {
        int half = nums.length/2;
        Set<Integer> set = Arrays.stream(nums)
            .boxed()
            .collect(Collectors.toSet());
        
        return set.size() < half ? set.size() : half;
    }
}