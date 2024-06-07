class Solution {
    public String solution(String str, int[][] q) {
        for (int[] ints : q) {
            StringBuilder sb = new StringBuilder(str.substring(ints[0], ints[1] + 1));
            String first = str.substring(0, ints[0]);
            String second = sb.reverse().toString();
            String third = str.substring(ints[1]+1);
            str = first + second + third;
        }
        return str;
    }
}