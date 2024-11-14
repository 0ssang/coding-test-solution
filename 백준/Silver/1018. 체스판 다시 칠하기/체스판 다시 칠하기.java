import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 체스판 입력 받기
        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int minCount = Integer.MAX_VALUE;

        // 8x8 크기로 잘라가며 최소 수정 횟수 찾기
        for (int j = 0; j <= N - 8; j++) {
            for (int i = 0; i <= M - 8; i++) {
                // 두 가지 색으로 시작해보면서 최소 수정 횟수 계산
                minCount = Math.min(minCount, search(board, j, i, 'W'));
                minCount = Math.min(minCount, search(board, j, i, 'B'));
            }
        }

        System.out.println(minCount);
    }

    // 시작 색상을 기준으로 8x8 체스판의 수정 횟수를 계산하는 메서드
    public static int search(char[][] board, int y, int x, char startColor) {
        int count = 0;

        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                char expectedColor = ((j + i) % 2 == 0) ? startColor : (startColor == 'W' ? 'B' : 'W');
                if (board[y + j][x + i] != expectedColor) {
                    count++;
                }
            }
        }

        return count;
    }
}