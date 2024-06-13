import java.util.*;
import java.io.*;
public class Main {
    static boolean[][] board;
    static int min = 64;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        while (N > 0){
            int x = Integer.parseInt(br.readLine());
            if(x != 0){
                stack.push(x);
            } else {
                stack.pop();
            }
            N--;
        }
        int res = 0;
        while(!stack.isEmpty()){
            res += stack.pop();
        }
        System.out.println(res);
    }
}