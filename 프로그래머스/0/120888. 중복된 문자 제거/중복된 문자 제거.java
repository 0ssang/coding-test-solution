import java.util.stream.*;
class Solution {
    public String solution(String s) {
        return Stream.of(s.split(""))
                .distinct()
                .collect(Collectors.joining());
    }
}