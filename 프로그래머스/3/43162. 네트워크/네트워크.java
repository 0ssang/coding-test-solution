class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int cnt = 0;
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                cnt++;
                dfs(computers, visited, i);
            }
        }
        return cnt;
    }
    static void dfs(int[][] computers, boolean[] visited, int idx){
        visited[idx] = true;
        
        for(int i = 0; i < computers.length; i++){
            if(computers[idx][i] == 1 && !visited[i]){
                dfs(computers, visited, i);
            }
        }
    }
}