class Solution {
    public int[] solution(int[] prices) {
        for(int i = 0; i < prices.length - 1; i++){
            int cnt = 0;
            for(int j = i+1; j < prices.length; j++){
                if(prices[i] <= prices[j]){
                    cnt++;
                }else {
                    cnt++;
                    break;
                }
            }
            prices[i] = cnt;
        }
        prices[prices.length-1] = 0;
        return prices;
    }
}