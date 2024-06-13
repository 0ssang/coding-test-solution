import java.util.*;
import java.io.*;
public class Main {
    static boolean[][] board;
    static int min = 64;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(N > 0){
            int x = Integer.parseInt(st.nextToken());
            map.put(x, map.getOrDefault(x, 0) + 1);
            N--;
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(M > 0){
            int num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)){
                sb.append(map.get(num)).append(" ");
            }else{
                sb.append(0).append(" ");
            }
            M--;
        }
        System.out.println(sb);
    }
}