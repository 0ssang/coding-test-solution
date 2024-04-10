import java.util.*;
class Solution {
    public String solution(String str) {
        // return Stream.of(str.split(""))
        //     .map(String::toLowerCase)
        //     .sorted()
        //     .collect(Collectors.joining());
        char[] chars = str.toLowerCase().toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}