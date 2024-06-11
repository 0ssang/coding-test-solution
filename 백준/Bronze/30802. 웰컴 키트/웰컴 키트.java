import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int[] arr = new int[6];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int T = sc.nextInt();
        int P = sc.nextInt();
        int t = 0;
        for(int n : arr){
            if(n%T == 0) t += n/T;
            else t += n/T + 1;
        }
        System.out.println(t);
        System.out.println(N/P+" "+N%P);
    }
}