import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
	int r, c, cnt;

	Node(int r, int c, int cnt) {
		this.r = r;
		this.c = c;
		this.cnt = cnt;
	}
}

public class Main {
	static int n, m, ans;
	static int[][] map;
	static boolean[][] visited;

	// 상, 하, 좌, 우
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력 처리
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		map = new int[n][m];
		visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			char[] str = br.readLine().toCharArray();
			for (int j = 0; j < m; j++) {
				map[i][j] = str[j] - '0';
			}
		}

		bfs();

		// 결과 출력
		System.out.println(ans);
	}

	static void bfs() {
		Queue<Node> bfsQ = new ArrayDeque<>();
		bfsQ.offer(new Node(0, 0, 1));
		visited[0][0] = true;

		while (!bfsQ.isEmpty()) {
			Node curr = bfsQ.poll();

			if (curr.r == n - 1 && curr.c == m - 1) {
				ans = curr.cnt;
				break;
			}

			for (int dir = 0; dir < 4; dir++) {
				int nr = curr.r + dr[dir];
				int nc = curr.c + dc[dir];
				if (canGo(nr, nc)) {
					bfsQ.offer(new Node(nr, nc, curr.cnt + 1));
					visited[nr][nc] = true;
				}
			}
		}
	}

	static boolean canGo(int r, int c) {
		return (0 <= r && r < n && 0 <= c && c < m) && !visited[r][c] && map[r][c] == 1;
	}
}