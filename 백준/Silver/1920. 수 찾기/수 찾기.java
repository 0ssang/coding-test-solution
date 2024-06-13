import java.util.*;
import java.io.*;
public class Main {
    static boolean[][] board;
    static int min = 64;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(M > 0){
            int x = Integer.parseInt(st.nextToken());
            int start = 0;
            int end = arr.length-1;
            boolean ck = false;
            while(start <= end){
                int mid = (end + start)/2;
                if(arr[mid] == x){
                    sb.append(1).append('\n');
                    ck = true;
                    break;
                }else if(arr[mid] < x){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
            if(!ck) sb.append(0).append('\n');
            M--;
        }
        System.out.println(sb);
    }
}