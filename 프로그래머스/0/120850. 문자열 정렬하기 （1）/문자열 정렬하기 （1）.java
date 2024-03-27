import java.util.stream.*;

class Solution {
    public int[] solution(String s) {
        return Stream.of(s.replaceAll("[a-z]", "").split(""))
            .mapToInt(Integer::valueOf)
            .sorted()
            .toArray();
    }
}