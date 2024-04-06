import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        int sum = 0;
        for(int i = 0; i < N; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            arr2[i] = sc.nextInt() * -1;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < N; i++){
            sum += arr1[i] * (arr2[i] * -1);
        }
        System.out.println(sum);
    }
}
