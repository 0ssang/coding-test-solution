import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();// + -  출력용
        Stack<Integer> s = new Stack<>();
        int T = Integer.parseInt(br.readLine());
        // 배열생성
        int[] arr = new int[T];
        for(int i=0; i<T; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int idx = 0;
        int num = 1;
        s.push(num++);
        sb.append("+").append("\n");
        while(idx < T){
            if( !s.isEmpty() && s.peek() == arr[idx]){
                s.pop();
                idx++;
                sb.append("-").append("\n");
            }else if(num <= T+1){
                s.push(num++);
                sb.append("+").append("\n");
            } else break;
        }
        if(s.isEmpty()) System.out.println(sb);
        else System.out.println("NO");
    }
}