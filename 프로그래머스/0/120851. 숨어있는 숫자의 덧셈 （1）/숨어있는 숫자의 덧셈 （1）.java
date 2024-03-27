import java.util.stream.*;
class Solution {
    public int solution(String str) {
        return Stream.of(str.replaceAll("[A-Z|a-z]", "").split(""))
            .mapToInt(Integer::valueOf)
            .sum();
    }
}