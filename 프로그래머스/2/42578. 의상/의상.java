import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> hm = new HashMap<>();
        for(String[] clothe : clothes){
            hm.put(clothe[1], hm.getOrDefault(clothe[1], 0) + 1);
        }
        Iterator<Integer> it = hm.values().iterator();
        int answer = 1;
        while(it.hasNext()){
            answer *= it.next().intValue()+1;
        }
        return answer - 1;
    }
}