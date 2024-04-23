import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = arr.length-1; i >= 0; i--){
            if(K / arr[i] > 0){
                count += K / arr[i];
                K %= arr[i];
            }
            if(K == 0) break;
        }
        System.out.println(count);
    }
}