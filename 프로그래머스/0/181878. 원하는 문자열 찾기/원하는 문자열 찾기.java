class Solution {
    public int solution(String myString, String pat) {
        // 먼저 소문자 정렬 후 비교하기
        pat = pat.toLowerCase();
        myString = myString.toLowerCase();
        return myString.contains(pat) ? 1 : 0;
        // 비교하면서 소문자 or 대문자로 비교하기
    }
}