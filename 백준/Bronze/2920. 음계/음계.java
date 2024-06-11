import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        // 순서대로 뺀 값이 계속 1이면 내림차순, -1 이면 오름차순, 그 외 나머지는 mixed
        for(int i=0; i< arr.length -1; i++){
            if(arr[i] - arr[i+1] != -1 && arr[i] - arr[i+1] != 1){
                System.out.println("mixed");
                break;
            }else{
                sum += arr[i] - arr[i+1];
            }
        }

        if(sum == -7) System.out.println("ascending");
        else if(sum == 7) System.out.println("descending");
    }
}