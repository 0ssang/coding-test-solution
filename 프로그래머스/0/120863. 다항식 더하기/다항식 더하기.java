class Solution {
    public String solution(String p) {
        int x = 0;
        int n = 0;
        for(String s : p.split(" ")){
            if(s.equals("+")) continue;
            if(s.equals("x")){
                x++;
            }else if(s.contains("x")){
                x += Integer.parseInt(s.replace("x", ""));
            } else{
                n += Integer.parseInt(s);
            }
        }
        if(x != 0 && n != 0){
            if(x == 1){
                return "x + "+n;
            }else{
                return x+"x + "+n;
            }
        }else if(x == 0){
            return String.valueOf(n);
        }else if(x == 1){
            return "x";
        }else {
            return x+"x";
        }
    }
}