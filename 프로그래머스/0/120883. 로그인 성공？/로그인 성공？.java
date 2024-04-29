class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        boolean hasId = false;
        
        for(String[] d : db){
            if(id.equals(d[0])){
                if(pw.equals(d[1])){
                    return "login";
                }
                hasId = true;
            }
        }
        return hasId ? "wrong pw" : "fail";
    }
}