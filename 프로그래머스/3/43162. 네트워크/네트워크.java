class Solution {
    static int count = 0;
    
    public int solution(int n, int[][] computers) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(computers[i][j] == 1){
                    count++;
                    dfs(computers, i, j, n);
                }
            }
        }
        
        return count;
    }
    
    static void dfs(int[][] computers, int y, int x, int n){
        computers[y][x] = 0;
        for(int i = 0; i < computers.length; i++){
            if(computers[y][i] == 1)
                dfs(computers, y, i, n);
            if(computers[i][x] == 1)
                dfs(computers, i, x, n);
        }
    }
}