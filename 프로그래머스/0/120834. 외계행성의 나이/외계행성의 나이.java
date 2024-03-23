import java.util.stream.*;
import java.util.*;
class Solution {
    public String solution(int age) {
        return Stream.of(String.valueOf(age).split(""))
            .map(Integer::parseInt)
            .map(i -> (char)(i+97))
            .map(String::valueOf)
            .collect(Collectors.joining());
    }
}