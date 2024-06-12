import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // Queue를 이용한 풀이
//        Queue<Integer> q = new LinkedList<>();
//        for(int i=1; i<=N; i++){
//            q.offer(i);
//        }
//
//        sb.append("<");
//
//        while(q.size() > 1){
//            for(int i=0; i<K-1; i++){
//                q.offer(q.poll());
//            }
//            sb.append(q.poll()).append(", ");
//        }
//
//        sb.append(q.poll()).append(">");
//        System.out.println(sb);
        // List를 이용한 풀이
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=1; i<=N; i++){
            list.add(i);
        }
        int idx = 0;
        sb.append('<');
        while(N > 1){
            idx = (idx + (K-1)) % N;
            sb.append(list.remove(idx)).append(", ");
            N--;
        }
        sb.append(list.remove()).append('>');
        System.out.println(sb);
    }
}