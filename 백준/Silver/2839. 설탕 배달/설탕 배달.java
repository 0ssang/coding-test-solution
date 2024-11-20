import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=N/5; i>=0; i--){
            int sugar = N;
            cnt = i;
            sugar -= 5 * i;
            if(sugar == 0){
                System.out.println(cnt);
                break;
            }else if(sugar % 3 == 0){
                cnt += sugar / 3;
                System.out.println(cnt);
                break;
            }
            if(i == 0){
                System.out.println(-1);
            }
        }
    }
}