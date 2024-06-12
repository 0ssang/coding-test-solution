import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        int res = (int)Math.pow(4,i) + (int)Math.pow(2,i+1) + 1;
        System.out.println(res);
    }
}