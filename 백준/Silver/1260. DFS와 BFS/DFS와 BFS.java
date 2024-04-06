import java.util.*;
public class Main{
    public static int N;
    public static int M;
    public static int V;
    public static boolean[][] arr;
    public static boolean[] visit;
    public static Queue<Integer> q;

    public static void dfs(int start){
        visit[start] = true;
        System.out.print(start+" ");
        for(int i=1; i<=N; i++){
            if(arr[start][i] && !visit[i]){
                dfs(i);
            }
        }
    }
    public static void bfs(int start){
        q = new LinkedList<Integer>();
        q.add(start);
        visit[start] = true;
        System.out.print(start+" ");
        while(!q.isEmpty()){
            int temp = q.poll();
            for(int i=1; i<=N;i++){
                if(arr[temp][i] && !visit[i]){
                    q.add(i);
                    visit[i] = true;
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();
        arr = new boolean[1001][1001];
        visit = new boolean[1001];

        //인접 행렬 생성
        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = arr[b][a] = true;
        }
        dfs(V);
        System.out.println();
        Arrays.fill(visit, false);
        bfs(V);
    }
}