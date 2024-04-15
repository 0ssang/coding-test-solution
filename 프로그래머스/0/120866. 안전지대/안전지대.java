class Solution {
    public int solution(int[][] board) {
        int cnt = board.length*board[0].length;
        boolean[][] checked = new boolean[board.length][board[0].length];
        // 1. (i-1, j-1), (i-1, j), (i-1, j+1)
        // 2. (i, j-1), (현위치 생략), (i, j+1)
        // 3. (i+1, j-1), (i+1, j), (i+1, j+1)
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 1){
                    checked[i][j] = true;
                    if(i>0 && j>0)checked[i-1][j-1] = true;
                    if(i>0) checked[i-1][j] = true;
                    if(i>0 && j<board[0].length-1)checked[i-1][j+1] = true;
                    if(j>0) checked[i][j-1] = true;
                    if(j<board[0].length-1)checked[i][j+1] = true;
                    if(i<board.length-1 && j>0)checked[i+1][j-1] = true;
                    if(i<board.length-1)checked[i+1][j] = true;
                    if(i<board.length-1 && j<board[0].length-1)checked[i+1][j+1] = true;
                }
            }
        }
        for(boolean[] bb : checked){
            for(boolean b : bb){
                if(b)cnt--;
            }
        }
        return cnt;
    }
}