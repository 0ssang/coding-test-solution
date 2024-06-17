import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";
        while((str = br.readLine()).length() != 1 || !str.equals(".")){
            Stack<Character> stack = new Stack<>();
            stack.push('.');
            for(char c : str.toCharArray()){
                if(c == '(' || c == '[') stack.push(c);
                else if(c == ')' ){
                    if(stack.peek() == '(') stack.pop();
                    else break;
                }else if(c == ']'){
                    if(stack.peek() == '[')stack.pop();
                    else break;
                }else if(c == '.' && stack.peek() == '.'){
                    stack.pop();
                }
            }
            if(stack.isEmpty()) sb.append("yes").append('\n');
            else sb.append("no").append('\n');
        }

        System.out.println(sb);
    }
}