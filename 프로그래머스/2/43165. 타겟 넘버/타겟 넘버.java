import java.util.*;

class Solution {    
    int count = 0;
    
    public int solution(int[] numbers, int target){
        dfs(numbers, 0, 0, target);
        return count;
    }
    
    private void dfs(int[] numbers, int sum, int index, int target){
        if(numbers.length == index) {
            if(sum == target) count++;
            return;
        }
        
        int x = numbers[index];
        dfs(numbers, sum + x, index + 1, target);
        dfs(numbers, sum - x, index + 1, target);
    }
}