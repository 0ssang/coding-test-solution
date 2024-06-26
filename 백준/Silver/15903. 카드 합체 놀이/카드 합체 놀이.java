import java.util.*;
public class Main {
    static PriorityQueue<Long> pq = new PriorityQueue<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < n; i++) pq.add(sc.nextLong());

        for(int i = 0; i < m; i++){
            Long a = pq.poll();
            Long b = pq.poll();
            pq.add(a+b);
            pq.add(a+b);
        }
        long ans = 0;
        while(!pq.isEmpty()){
            ans += pq.poll();
        }
        System.out.println(ans);
    }
}
