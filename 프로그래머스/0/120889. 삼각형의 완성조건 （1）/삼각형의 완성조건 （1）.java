import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int max = Arrays.stream(sides).max().orElse(-1);
        int sum = Arrays.stream(sides).sum() - max;
        return max < sum && max != -1 ? 1 : 2;
    }
}