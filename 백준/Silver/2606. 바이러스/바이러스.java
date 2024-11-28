import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }
        int cnt = 0;
        int pair = Integer.parseInt(br.readLine());
        for(int i = 1; i <= pair; i++ ){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        cnt = bfs(graph, 1, cnt);
        System.out.println(cnt);
    }

    static int bfs(List<List<Integer>> graph, int start, int cnt){
        Queue<Integer> que = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];
        que.offer(start);
        visited[start] = true;
        while(!que.isEmpty()){
            int cur = que.poll();
            for(int next : graph.get(cur)){
                if(!visited[next]){
                    cnt += 1;
                    visited[next] = true;
                    que.add(next);
                }
            }
        }

        return cnt;
    }
}