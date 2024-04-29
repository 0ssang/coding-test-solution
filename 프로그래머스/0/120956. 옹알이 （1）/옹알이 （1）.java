class Solution {
    public int solution(String[] bb) {
        String[] dic = {"aya", "ye", "woo", "ma"};
        
        // bb를 하나씩 순회하면서 aya, ye, woo, ma 를 각각 제거한다.
        //      해당 단어로 시작하거나, 해당 단어로 끝나는 경우 제거.
        //      제거 후 남은 문자열이 dic의 문자열과 같으면 제거한다.
        // 제거 후 빈 문자열이면 res를 1 증가시킨다.
        
        int res = 0;
        
        for(String b : bb){
            
            for(String d : dic){
                if(b.endsWith(d) || b.startsWith(d)){
                    b = b.replaceFirst(d,"");
                }
            }
            
            for(String d : dic){
                if(b.matches(d))
                    res++;
            }
            
            if(b.isEmpty()) res++;
        }
        
        return res;
    }
}