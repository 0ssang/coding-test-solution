import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        // ascii a = 97;
        int sum = 0;
        for(int i=0; i<N; i++){
            int n = str.charAt(i) - 96;
            sum += n * (int)Math.pow(31, i);
        }
        System.out.println(sum);
    }
}