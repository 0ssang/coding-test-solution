import java.util.stream.*;
class Solution {
    public String solution(String str) {
        return str.replaceAll("[aeiou]", "");
    }
}