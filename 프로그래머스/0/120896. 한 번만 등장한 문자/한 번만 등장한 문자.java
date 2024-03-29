import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        Map<String, Integer> m= new HashMap<>();
        List<String> l = new ArrayList<>();

        for(String c : s.split(""))
            m.put(c, m.getOrDefault(c, 0) + 1);

        for(String c : m.keySet()){
            if(m.get(c) == 1)
                l.add(c);
        }

        return l.stream().sorted().collect(Collectors.joining());
    }
}