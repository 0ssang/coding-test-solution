import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=N/5; i>=0; i--){
            int bags = N;
            cnt = i;
            bags -= 5 * i;
            if(bags == 0){
                System.out.println(cnt);
                break;
            }else if(bags % 3 == 0){
                cnt += bags/3;
                System.out.println(cnt);
                break;
            }
            if(i == 0){
                System.out.println(-1);
            }
        }

    }
}