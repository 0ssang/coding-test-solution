import java.util.stream.*;
class Solution {
    public String solution(String str) {
        return Stream.of(str.split(""))
            .filter(c -> !c.equals("a") && !c.equals("i") && !c.equals("u") && !c.equals("e") && !c.equals("o"))
            .collect(Collectors.joining());
    }
}