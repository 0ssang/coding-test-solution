import java.util.*;
import java.io.*;
public class Main {
    static boolean[][] board;
    static int min = 64;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for(int j=0; j<M; j++){
                if(str.charAt(j) == 'W'){
                    board[i][j] = true;
                }else{
                    board[i][j] = false;
                }
            }
        }

        int row = N - 7;
        int col = M - 7;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                find(i, j);
            }
        }
        // 결과 출력!!
        System.out.println(min);
    }
    static void find(int x, int y){
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;
        boolean TF = board[x][y];

        for(int i=x; i<end_x; i++){
            for(int j=y; j<end_y; j++){
                if(board[i][j] != TF) count++;
                TF = !TF;
            }
            TF = !TF;
        }
        count = Math.min(count, 64-count);
        // 최솟값 갱신
        min = Math.min(min, count);
    }
}