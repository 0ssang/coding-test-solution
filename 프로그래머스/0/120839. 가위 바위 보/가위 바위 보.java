import java.util.stream.*;
class Solution {
    public String solution(String rsp) {
        return Stream.of(rsp.split(""))
            .map(Integer::parseInt)
            .map(i -> i == 0 ? 5 : i == 2 ? 0 : 2)
            .map(String::valueOf)
            .collect(Collectors.joining());
    }
}