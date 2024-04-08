import java.util.*;
class Solution {
    public int solution(int num, int k) {
        int res = -1;
        int idx = 0;
        Stack<Integer> stack = new Stack<>();
        
        while(num/10 > 0){
            stack.push(num%10);
            num /= 10;
        }
        stack.push(num);
        
        while(!stack.isEmpty()){
            idx++;
            if(stack.pop() == k){
                res = idx;
                break;
            }
        }
        return res;
    }
}