import java.util.*;
class Solution {
    public int solution(int[] p, int l) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for(int x : p) {
            list.add(x);
        }
        while(l >= 0) {
            System.out.println(list.get(0));
            int max = Collections.max(list);
            if(list.get(0) >= max) {
                list.remove(0);
                l--;
                answer++;
                if(l < 0) {
                    break;
                }
            } else {
                int tmp = list.get(0);
                list.remove(0);
                list.add(tmp);
                l--;
                if(l < 0) {
                    l = list.size()-1;
                }
            }
        }
        return answer;
    }
}