class Solution {
    public int solution(String mystr) {
        String str = "";
        int sum = 0;
        
        for(String s : mystr.split("")){
            if(s.matches("[0-9]")){
                str += s;
            } else{
                if(!str.isEmpty())
                    sum += Integer.parseInt(str);
                str = "";
            }
        }
        if(!str.isEmpty())
            sum += Integer.parseInt(str);
        
        return sum;
    }
}