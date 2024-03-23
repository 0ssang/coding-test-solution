import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> list = Arrays.stream(emergency)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 1; i <= list.size(); i++)
            map.put(list.get(i-1), i);

        list.clear();

        for(int n : emergency)
            list.add(map.get(n));
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}