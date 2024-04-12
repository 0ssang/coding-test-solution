import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        for(int i = 0; i < N; i++){
            basket[i] = i;
        }
        for(int it = 0; it < M; it++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;
            while (i < j){
                int temp = basket[i];
                basket[i++] = basket[j];
                basket[j--] = temp;
            }
        }
        for (int a : basket) {
            sb.append(a + 1).append(" ");
        }
            System.out.println(sb);
    }
}