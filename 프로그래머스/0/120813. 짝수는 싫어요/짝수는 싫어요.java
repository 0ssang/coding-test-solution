import java.util.stream.*;
class Solution {
    public int[] solution(int n) {
        IntStream stream = IntStream.rangeClosed(1, n);
        int[] answer = stream.filter(i -> i % 2 != 0).toArray();
        return answer;
    }
}