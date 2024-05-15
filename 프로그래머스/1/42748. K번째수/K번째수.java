import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] com) {
        int[] ans = new int[com.length];

        for(int i = 0; i < com.length; i++){
            int[] tmp = Arrays.copyOfRange(array, com[i][0] -1, com[i][1]);
            Arrays.sort(tmp);
            ans[i] = tmp[com[i][2] - 1];
        }
        
        return ans;
    }
}