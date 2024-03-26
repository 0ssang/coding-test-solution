class Solution {
    public int[][] solution(int[] a, int n) {
        int[][] a2 = new int[a.length / n][n];
        for(int i = 0; i < a.length / n; i++){
            for(int j = 0; j < n; j++){
                a2[i][j] = a[n*i+j];
            }
        }
        return a2;
    }
}