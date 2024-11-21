import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        if(N >= 2) dp[2] = 1;
        if(N >= 3) dp[3] = 1;
        
        for(int i=4; i<=N; i++){
            dp[i] = dp[i-1] + 1;
            if(i % 3 == 0){
                int min = Math.min(dp[i], dp[i/3]+1);
                dp[i] = min; 
            }
            if(i % 2 == 0){
                int min = Math.min(dp[i], dp[i/2]+1);
                dp[i] = min;
            }
        }
        System.out.println(dp[N]);
    }
}