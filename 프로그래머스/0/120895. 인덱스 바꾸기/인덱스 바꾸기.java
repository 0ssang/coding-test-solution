import java.util.*;
import java.util.stream.*;
class Solution {
    public String solution(String str, int num1, int num2) {
        // char[] chars = str.toCharArray();
        // char tmp = chars[num1];
        // chars[num1] = chars[num2];
        // chars[num2] = tmp;
        // return String.valueOf(chars);
        List<String> list = Arrays.stream(str.split("")).collect(Collectors.toList());
        Collections.swap(list, num1, num2);
        return String.join("", list);
    }
}