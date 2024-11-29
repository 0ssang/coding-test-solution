import java.util.*;
import java.io.*;

public class Main{
    // 방향벡터 설정
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException{
        // 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        for(int i=0; i<N; i++){
            String[] line = br.readLine().split("");
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        // 입력데이터 가지고 탐색 수행
        System.out.println(search(map));
    }

    static String search(int[][] map) {
        int N = map.length;
        boolean[][] visited = new boolean[N][N];
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        
        // 배열의 처음부터 마지막까지 순회
        int cnt = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j] != 0 && !visited[i][j]){
                    list.add(bfs(map, visited, i, j));
                    cnt += 1;
                }
            }
        }
        
        sb.append(cnt).append('\n');

        Collections.sort(list);

        for(int val : list){
            sb.append(val).append("\n");
        }
        
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    static int bfs(int[][] map, boolean[][] visitied, int y, int x) {
        int cnt = 1;
        int N = map.length;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{y, x});
        visitied[y][x] = true;

        while(!queue.isEmpty()){
            int[] point = queue.poll();
            int cy = point[0];
            int cx = point[1];

            // 방향벡터 사용하여 상->우->하->좌 방향 탐색
            for(int k=0; k<4; k++){
                int ny = cy + dy[k];
                int nx = cx + dx[k];

                // 탐색조건 => 좌표 (ny, nx)가 map안에 존재하고 && 방문한적이 없고, 1이여야 함
                if(nx >= 0 && nx < N && ny >= 0 &&  ny < N && !visitied[ny][nx] && map[ny][nx] != 0){
                    queue.offer(new int[]{ny, nx});
                    visitied[ny][nx] = true;
                    cnt += 1;
                }
            }
        }

        return cnt;
    }
}