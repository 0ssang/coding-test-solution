class Solution {
    public String[] solution(String str, int n) {
        StringBuilder sb = new StringBuilder();
        String strs[];
        if(str.length()%n == 0){
            strs = new String[str.length()/n];
        }else{
            strs = new String[str.length()/n + 1];
        }

        for(int i=0; i<strs.length; i++){
            for(int j=0; j<n; j++){
                if(i*n+j < str.length()){
                    sb.append(str.charAt(i*n+j));
                }
            }
            strs[i] = sb.toString();
            sb.setLength(0);
        }
        
        return strs;
    }
}