import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        br.close();

        // 각 노드의 인접 리스트를 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }

        boolean[] visitied = new boolean[N+1];
        StringBuilder dfsResult = new StringBuilder();
        dfs(graph, V, visitied, dfsResult);
        System.out.println(dfsResult.toString().trim());

        String bfsResult = bfs(graph, V, N);
        System.out.println(bfsResult.trim());
    }

    private static void dfs(List<List<Integer>> graph, int current, boolean[] visitied, StringBuilder result){
        visitied[current] = true;
        result.append(current).append(" ");

        for(int next : graph.get(current)){
            if(!visitied[next]){
                dfs(graph, next, visitied, result);
            }
        }
    }

    private static String bfs(List<List<Integer>> graph, int start, int nodes){
        Queue<Integer> que = new LinkedList<>();
        boolean[] visited = new boolean[nodes+1];
        StringBuilder result = new StringBuilder();

        que.add(start);
        visited[start] = true;

        while(!que.isEmpty()){
            int current = que.poll();
            result.append(current).append(" ");

            for(int next : graph.get(current)){
                if(!visited[next]){
                    que.add(next);
                    visited[next] = true;
                }
            }
        }
        return result.toString();
    }
}