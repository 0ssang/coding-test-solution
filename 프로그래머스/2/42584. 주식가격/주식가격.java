import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        // for(int i = 0; i < prices.length - 1; i++){
        //     int cnt = 0;
        //     for(int j = i+1; j < prices.length; j++){
        //         if(prices[i] <= prices[j]){
        //             cnt++;
        //         }else {
        //             cnt++;
        //             break;
        //         }
        //     }
        //     prices[i] = cnt;
        // }
        // prices[prices.length-1] = 0;
        // return prices;
        Stack<Integer> beginIdxs = new Stack<>();
        int i=0;
        int[] terms = new int[prices.length];

        beginIdxs.push(i);
        for (i=1; i<prices.length; i++) {
            while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
                int beginIdx = beginIdxs.pop();
                terms[beginIdx] = i - beginIdx;
            }
            beginIdxs.push(i);
        }
        while (!beginIdxs.empty()) {
            int beginIdx = beginIdxs.pop();
            terms[beginIdx] = i - beginIdx - 1;
        }
        return terms;
    }
}