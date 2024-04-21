class Solution {
    public int solution(String[] spell, String[] dic) {
        for(int i = 0; i < dic.length; i++){
            if(dic[i].length() == spell.length){
                for(String s : spell){
                    dic[i] = dic[i].replaceFirst(s, "");
                }
                if(dic[i].isEmpty()){
                    return 1;
                }
            }
            
        }
        return 2;
    }
}