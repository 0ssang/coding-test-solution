import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[N-1];
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, arr[i]*(N-i));
        }
        System.out.println(max);
    }
}