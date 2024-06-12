import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while(N > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int lcm = (a * b) / gdc(a,b);
            sb.append(lcm).append('\n');
            N--;
        }
        System.out.println(sb);
    }
    static int gdc(int x, int y){
        if(x % y == 0) return y;
        return gdc(y, x%y);
    }
}