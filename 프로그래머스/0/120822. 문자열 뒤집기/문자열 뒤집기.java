import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String my_string) {
        List<String> list = Stream.of(my_string.split("")).collect(Collectors.toList());
        Collections.reverse(list);
        return String.join("", list);
    }
}