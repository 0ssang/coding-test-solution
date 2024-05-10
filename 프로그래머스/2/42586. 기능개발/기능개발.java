import java.util.*;
class Solution {
    public int[] solution(int[] pg, int[] sp) {
        List<Integer> list = new ArrayList<>();
        int prev = (100 - pg[0]) % sp[0] != 0 ? (100 - pg[0]) / sp[0] + 1 : (100 - pg[0]) / sp[0];
        int cnt = 1;
        for(int i = 1; i < sp.length; i++) {
            int cur = (100 - pg[i]) % sp[i] != 0 ? (100 - pg[i]) / sp[i] + 1 : (100 - pg[i]) / sp[i];
            if(prev < cur){
                list.add(cnt);
                prev = cur;
                cnt = 1;
            }else {
                cnt++;
            }
        }
        list.add(cnt);
        int[] res = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        
        return res;
    }
}