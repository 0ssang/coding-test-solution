import java.util.stream.*;
class Solution {
    public int[] solution(String[] strlist) {
        return Stream.of(strlist).map(String::length).mapToInt(i -> i).toArray();
    }
}