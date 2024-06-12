import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while(N > 0){
            int cost = Integer.parseInt(br.readLine());
            sb.append(cost/25).append(" ");
            cost %= 25;
            sb.append(cost/10).append(" ");
            cost %= 10;
            sb.append(cost/5).append(" ").append(cost%5).append("\n");
            N--;
        }
        System.out.println(sb);
    }
}