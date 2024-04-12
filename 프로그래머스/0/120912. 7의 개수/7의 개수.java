class Solution {
    public int solution(int[] arr) {
        int cnt = 0;
        
        for(int i : arr){
            for(String s : String.valueOf(i).split("")){
                if(s.equals("7"))
                    cnt++;
            }
        }
        
        return cnt;
    }
}