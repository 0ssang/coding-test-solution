import java.util.stream.*;
class Solution {
    public String solution(String str) {
        return Stream.of(str.split(""))
            .map(String::toLowerCase)
            .sorted()
            .collect(Collectors.joining());
    }
}