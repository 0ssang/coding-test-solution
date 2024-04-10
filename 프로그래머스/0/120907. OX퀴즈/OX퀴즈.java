import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        List<String> list = new ArrayList<>();
        List<String> res = new ArrayList<>();
        int sum = 0;
        for(String str : quiz){
            list.clear();
            sum = 0;
            for(String s : str.split(" ")){
                list.add(s);
            }
            int left = Integer.parseInt(list.get(0));
            String op = list.get(1);
            int right = Integer.parseInt(list.get(2));
            if(op.equals("+")){
                sum = left + right;
                res.add(sum == Integer.parseInt(list.get(4)) ? "O" : "X");
            }else if(op.equals("-")){
                sum = left - right;
                res.add(sum == Integer.parseInt(list.get(4)) ? "O" : "X");
            }
        }
        String[] answer = new String[res.size()];
        for(int i = 0; i < res.size(); i++){
            answer[i] = res.get(i);
        }
        return answer;
    }
}