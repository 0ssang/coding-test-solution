import java.io.*;
public class Main {
    final static int M = 1234567891;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt=0;

        for(int i=1; i<=n; i++){
            int num = i;
            while(num%5==0){
                cnt++;
                num/=5;
            }
        }
        System.out.println(cnt);
    }
}