import java.util.*;
import java.io.*;

public class Main{
    static int[] dy = {-1, 0, 1, 0};
    static int[] dx = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()) - 1;
        int M = Integer.parseInt(st.nextToken()) - 1;
        int[][] map = new int[N+1][M+1];

        for(int i=0; i<=N; i++){
            String[] line = br.readLine().split("");
            for(int j=0; j<=M; j++){
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        System.out.println(bfs(map, N, M));
    }

    static int bfs(int[][] map, int N, int M) {
        Queue<int[]> que = new LinkedList<>();
        que.offer(new int[]{0, 0, 1});
        map[0][0] = 0;
        while(!que.isEmpty()){
            int[] point = que.poll();
            int x = point[1];
            int y = point[0];
            int cnt = point[2];

            for(int k=0; k<4; k++){
                int nx = x + dx[k];
                int ny = y + dy[k];
                if(ny == N && nx == M){
                    return ++cnt;
                }
                if(ny >= 0 && ny <= N && nx >= 0 && nx <= M && map[ny][nx] == 1){
                    que.offer(new int[]{ny, nx, cnt+1});
                    map[ny][nx] = 0;
                }
            }
        }

        return -1;
    }
}