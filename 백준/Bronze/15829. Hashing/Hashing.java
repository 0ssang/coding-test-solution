import java.io.*;
public class Main {
    final static int M = 1234567891;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        // ascii a = 97;
        long sum = 0;
        long pow = (long) Math.pow(31, 0);
        for(int i=0; i<N; i++){
            int n = str.charAt(i) - 96;
            sum += n * pow % M;
            pow = (pow * 31) % M;
        }
        sum %= M;
        System.out.println(sum);
    }
}