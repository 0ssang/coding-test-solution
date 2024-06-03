import java.util.*;
class Solution {
    public String[] solution(String myString) {
        //StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for(String s : myString.split("x")){
            if(!s.equals(""))
                list.add(s);
        }
        list.sort(Comparator.naturalOrder());
        return list.toArray(new String[0]);
    }
}