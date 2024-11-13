import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        List<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());  // 첫 번째 줄에서 N을 읽음
        
        String[] inputNumbers = br.readLine().split(" ");  // 두 번째 줄에서 숫자들을 읽어 공백으로 분리
        
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(inputNumbers[i]));  // 각 숫자를 정수로 변환하여 리스트에 추가
        }
        int total = 0;
        Collections.sort(list);  // 리스트 정렬
        
        for(int i=0; i<list.size(); i++){
            int sum = 0;
            for(int j=0; j<=i; j++){
                sum += list.get(j);
            }
            total += sum;
        }
        System.out.println(total);
        
        br.close();
    }
}