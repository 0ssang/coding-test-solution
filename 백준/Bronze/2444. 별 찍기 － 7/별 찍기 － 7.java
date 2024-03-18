import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            for(int j = 0; j < i + N; j++){
                if(j < N-(1+i)) sb.append(" ");
                else sb.append("*");
            }
            sb.append('\n');
        }
        for(int i = 0; i < N-1; i++){
            for(int j = 0; j < (N-1)*2-i; j++){
                if(j < i+1) sb.append(" ");
                else sb.append("*");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}