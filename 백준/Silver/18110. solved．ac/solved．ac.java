import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        //double percent = 0.01;
        // 아직 아무 의견이 없다면 난이도는 0으로 한다.
        // 의견이 하나 이상 있다면, 문제의 난이도는 모든 사람의 난이도 의견의 30% 절사평균으로 결정한다.
        // 30% 절사평균이라면 위에서 15% 아래에서 15%를 제외하고 평균을 나타내는 것을 말한다.
        // 제외되는 사람의 수는 위, 아래에서 각각 반올림한다. 절사평균이 16.7 이라면 최 난이도는 17이다.
        // 사용자들이 어떤 문제에 제출한 난이도 의견 목록이 주어질 때, 난이도를 계산하는 프로그램을 작성하시오.
        int difficulty = 0;
        if(n != 0){
            int[] opinion = new int[n];
            for(int i=0; i<n; i++){
                opinion[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(opinion);
            int r = (int)Math.round(n * 0.15);
            int sum = 0;
            for(int i=r; i<opinion.length-r; i++){
                sum += opinion[i];
            }
            difficulty = (int)Math.round((double)sum / (n-2*r));
        }

        System.out.println(difficulty);
    }
}