import java.util.stream.*;
class Solution {
    public String solution(String my_string, String letter) {
        return Stream.of(my_string.split("")).filter(s -> !letter.equals(s)).collect(Collectors.joining());
    }
}