class Solution {
    public int solution(String before, String after) {
        for(String s : before.split("")){
            after = after.replaceFirst(s, "");
        }
        return after.isEmpty() ? 1 : 0;
    }
}