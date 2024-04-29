class Solution {
    public int solution(int chicken) {
        int order = 0;
        while (chicken >= 10) {
            order += chicken / 10;
            chicken = chicken / 10 + chicken % 10;
        }
        return order;
    }
}