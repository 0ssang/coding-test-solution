import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        while(T-->0){
            int N = sc.nextInt();
            long[] arr = new long[N];
            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextLong();
            }
            long max = 0;
            long answer = 0;
            for(int j = N-1; j >=0; j--){
                if(arr[j] > max){
                    max = arr[j];
                }else {
                    answer += max - arr[j];
                }
            }
            sb.append(answer).append('\n');
        }
        System.out.println(sb);
    }
}