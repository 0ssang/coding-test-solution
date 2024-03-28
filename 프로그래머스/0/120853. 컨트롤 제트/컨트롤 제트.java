class Solution {
    public int solution(String s) {
        String[] str = s.split(" ");
        int sum = 0;
        int prev = 0;
        
        for(int i=0; i<str.length; i++){
            if(!str[i].equals("Z")){
                prev = Integer.parseInt(str[i]);
                sum += prev;
            }else{
                sum -= prev;
            }
        }
        
        return sum;
    }
}