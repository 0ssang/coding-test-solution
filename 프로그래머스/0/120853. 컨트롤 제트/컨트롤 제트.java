import java.util.*;
class Solution {
    public int solution(String s) {
        //String[] str = s.split(" ");
        //int sum = 0;
        //int prev = 0;
        
        //for(int i=0; i<str.length; i++){
            //if(!str[i].equals("Z")){
                //prev = Integer.parseInt(str[i]);
                //sum += prev;
            //}else{
                //sum -= prev;
            //}
        //}
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(String str : s.split(" ")){
            if(!str.equals("Z")){
                stack.push(Integer.parseInt(str));
            }else{
                stack.pop();
            }
        }
        for(int i : stack){
            sum += i;
        }
        return sum;
    }
}