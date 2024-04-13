import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        List<Integer> xlist = new ArrayList<>();
        List<Integer> ylist = new ArrayList<>();
        
        for(int[] d : dots){
            xlist.add(d[0]);
            ylist.add(d[1]);
        }
        
        xlist.sort(Comparator.naturalOrder());
        ylist.sort(Comparator.naturalOrder());
        
        return (xlist.get(xlist.size()-1) - xlist.get(0)) * (ylist.get(ylist.size() - 1) - ylist.get(0));
    }
}