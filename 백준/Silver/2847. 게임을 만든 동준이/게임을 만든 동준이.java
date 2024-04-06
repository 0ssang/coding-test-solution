import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] level = new int[N];
        int count = 0;
        for (int i = 0; i < N; i++) level[i] = sc.nextInt();

        for (int j = N-1; j >= 0; j--){
            if(j == 0) break;
            if(level[j] > level[j-1]){
                continue;
            }else {
                int x = level[j-1] - level[j];
                for(int k = 0; k <= x; k++){
                    level[j-1]--;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
