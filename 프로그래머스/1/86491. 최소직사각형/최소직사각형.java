import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        List<Integer> bigs = new ArrayList<>();
        List<Integer> smalls = new ArrayList<>();
        
        for(int[] size : sizes){
            if(size[0] < size[1]){
                int temp = size[0];
                size[0] = size[1];
                size[1] = temp;
            }
            bigs.add(size[0]);
            smalls.add(size[1]);
        }
        
        bigs.sort(Integer::compareTo);
        smalls.sort(Integer::compareTo);
        
        return bigs.get(sizes.length-1) * smalls.get(sizes.length-1);
    }
}