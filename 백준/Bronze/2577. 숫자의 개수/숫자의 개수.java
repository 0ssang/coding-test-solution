import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sum = 1;
        // 0~9 까지 카운팅 배열 생성
        int[] arr = new int[10];
        for(int i=0; i<3; i++){
            int n = sc.nextInt();
            sum *= n;
        }
        while(sum / 10 > 0){
            arr[sum%10]++;
            sum /= 10;
        }
        arr[sum%10]++;
        for(int n : arr){
            System.out.println(n);
        }

    }
}