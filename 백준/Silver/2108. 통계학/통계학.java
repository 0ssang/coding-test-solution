import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] counting = new int[8001];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // 배열 입력받기
        for(int i=0; i<N; i++){
            int x = Integer.parseInt(br.readLine());
            counting[x+4000]++;
            sum += x;

            if(max < x) max = x;
            if(min > x) min = x;
        }

        // **최빈값 구하기 (최빈값이 여러개인 경우 두 번째로 작은 값을 출력한다.)
        int freq = 0;
        int freqVal = 0;
        // 이전의 동일한 최빈값이 1번만 등장했을 경우 true, 아닐경우 false.
        boolean flag = false;
        int count = 0;
        int mid = 4001;
        // 2. 카운팅 정렬의 누적합 계산
        for(int i=min+4000; i<= max+4000; i++){
            if(count < (N+1)/2){
                count += counting[i];
                mid = i - 4000;
            }
            if(counting[i] > freq){
                freq = counting[i];
                freqVal = i - 4000;
                flag = true;
            }else if(freq == counting[i] && flag){
                freqVal = i - 4000;
                flag = false;
            }

            if(i != 0 ) counting[i] = counting[i-1] + counting[i];
        }


        // 산술평균 출력
        System.out.println((int)Math.round((double) sum / N));
        // 중앙값 출력
        System.out.println(mid);
        // 최빈값 출력
        System.out.println(freqVal);
        // 범위 출력
        System.out.println(max - min);
    }
}