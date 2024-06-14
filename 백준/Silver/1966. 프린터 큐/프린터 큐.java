import java.util.*;
import java.io.*;
public class Main {
    final static int M = 1234567891;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while(T > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            LinkedList<Integer> list = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<N; i++){
                list.addLast(Integer.parseInt(st.nextToken()));
            }
            int count = 0;
            int target = list.get(M);
            list.set(M, -1);
            boolean check;
            while(true){
                int now = list.peek();
                if(now == -1){
                    now = target;
                }

                check = false;

                for(int i=1; i<list.size(); i++){
                    int element;
                    if(list.get(i) == -1) element = target;
                    else element = list.get(i);
                    if(now < element){
                        list.offer(list.poll());
                        check = true;
                        break;
                    }
                }

                // 검색 결과 현재 원소보다 큰 값이 큐에 없다면 poll 하고 카운트 +1
                if(!check){
                    // 현재 원소가 찾고자 하는 원소인지 (원소의 중복 대비)
                    if(list.peek() == -1){
                        count++;
                        break;
                    }else {
                        list.poll();
                        count++;
                    }
                }
            }
            sb.append(count).append('\n');
            T--;
        }
        System.out.println(sb);
    }
}