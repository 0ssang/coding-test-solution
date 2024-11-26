import java.io.*;
import java.util.*;

class Main{
    public static void main(String[]  args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> deq = new ArrayDeque<>();
        for(int i=1; i<=N; i++){
            deq.offer(i);
        }
        
        while(deq.size() > 1){
            int target = deq.pollFirst();
            sb.append(target).append(" ");
            int iter = arr[target - 1];
            if(iter < 0){
                for(int i=iter; i<0; i++){
                    deq.offerFirst(deq.pollLast());
                }
            } else{
                for(int i=1; i<iter; i++){
                    deq.offerLast(deq.pollFirst());
                }
            }
        }

        sb.append(deq.poll());
        System.out.println(sb);
    }
}