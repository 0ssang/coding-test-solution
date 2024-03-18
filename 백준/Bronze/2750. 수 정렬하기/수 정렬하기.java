import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Integer[] arr = new Integer[N];
        for(int i = 0; i < N; i++) arr[i] = sc.nextInt();

        Arrays.stream(arr).sorted().forEach(System.out::println);
    }
}