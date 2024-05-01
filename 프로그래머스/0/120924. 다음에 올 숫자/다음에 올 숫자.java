class Solution {
    public int solution(int[] common) {
        int res = 0;
        // 2 < common의 길이 < 1,000
        // 등차수열인지 등비수열인지 구분한다.
        if(common[2] - common[1] == common[1] - common[0]) {
            // 등차수열인 경우
            int add = common[1] - common[0];
            res = common[common.length-1] + add;
        } else {
            // 등비수열인 경우
            int com = common[1] / common[0];
            res = common[common.length-1] * com;
        }
        
        return res;
    }
}