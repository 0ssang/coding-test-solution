import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target =  Integer.parseInt(br.readLine());
        int num = target;
        int cnt = 0;
        boolean ck = false;
        while(true){
            if(target == num && ck) break;
            int plus = (num / 10 + num % 10) % 10;
            num = (num % 10) * 10 + plus;
            ck = true;
            cnt++;
        }

        System.out.println(cnt);
    }
}