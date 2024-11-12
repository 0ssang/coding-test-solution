import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int tc = sc.nextInt();
        int[] arr = new int[tc];
        for(int i=0; i<tc; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int num : arr){
            sb.append(num).append('\n');
        }
        System.out.println(sb);
    }
}