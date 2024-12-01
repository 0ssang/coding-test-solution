import java.util.*;
import java.io.*;

public class Main {
    // 방향벡터 설정
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {
        // 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }

        // 탐색 수행
        System.out.println(search(map));
    }

    static String search(int[][] map) {
        int N = map.length;
        boolean[][] visited = new boolean[N][N];
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();

        // 배열의 처음부터 마지막까지 순회
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] != 0 && !visited[i][j]) {
                    list.add(dfs(map, visited, i, j));
                    cnt += 1;
                }
            }
        }

        sb.append(cnt).append('\n');
        Collections.sort(list);
        for (int val : list) {
            sb.append(val).append("\n");
        }

        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    static int dfs(int[][] map, boolean[][] visited, int y, int x) {
        int cnt = 1; // 현재 노드를 방문했으므로 카운트를 1로 시작
        int N = map.length;
        visited[y][x] = true;

        // 방향벡터 사용하여 상->우->하->좌 방향 탐색
        for (int k = 0; k < 4; k++) {
            int ny = y + dy[k];
            int nx = x + dx[k];

            // 탐색조건 => 좌표 (ny, nx)가 map 안에 존재하고 && 방문한 적이 없고, 1이어야 함
            if (nx >= 0 && nx < N && ny >= 0 && ny < N && !visited[ny][nx] && map[ny][nx] != 0) {
                cnt += dfs(map, visited, ny, nx); // 재귀 호출하여 연결된 모든 노드 탐색
            }
        }

        return cnt;
    }
}