class Solution {
    private int max = 0;  

    public int solution(int k, int[][] dungeons) {
        
        boolean[] visited = new boolean[dungeons.length];
        permute(dungeons, visited, 0, k, 0);
        return max;
    }
    
    private void permute(int[][] dungeons, boolean[] visited, int depth, int k, int count){
        max = Math.max(max, count);
        
        for(int i=0; i<dungeons.length; i++){
            if(!visited[i] && k >= dungeons[i][0]){
                visited[i] = true;
                permute(dungeons, visited, depth+1, k-dungeons[i][1], count+1);
                visited[i] = false;
            }
        }
    }
}
