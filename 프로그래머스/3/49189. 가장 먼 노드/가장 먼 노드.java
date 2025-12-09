import java.util.*;
class Solution {

    public int solution(int n, int[][] edge) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        
        for(int[] node : edge){
            graph.get(node[0]).add(node[1]);
            graph.get(node[1]).add(node[0]);
        }
        
        return bfs(n, graph);
    }
    
    private int bfs(int n, List<List<Integer>> graph){
        boolean[] visited = new boolean[n+1];
        Queue<Integer> queue = new LinkedList<>();
        int[] distance = new int[n+1];
        
        queue.offer(1);
        distance[1] = 0;
        visited[1] = true; 
        
        while(!queue.isEmpty()){
            int now = queue.poll();
            
            for(int next : graph.get(now)){
                if(!visited[next]){
                    visited[next] = true;
                    distance[next] = distance[now] + 1;
                    queue.offer(next);
                }
            }
        }
        int cnt = 0;
        int max = 0;
        for(int i=1; i<distance.length; i++){
            max = Math.max(distance[i], max);
        }
        
        for(int i=1; i<distance.length; i++){
            if(max == distance[i]) cnt++;
        }
        
        return cnt;
    }
}