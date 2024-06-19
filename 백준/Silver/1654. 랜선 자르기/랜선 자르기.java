import java.io.*;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int K = Integer.parseInt(st.nextToken()); 
		int N = Integer.parseInt(st.nextToken()); 
 
		int[] arr = new int[K];
		long max = 0;
		
		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		// 반드시 max에서 +1 값이어야 한다.
		max++; 
 
		long min = 0; 
		long mid = 0; 
 
		while (min < max) { 
			// 중간값 구하기
			mid = (max + min) / 2;
			long count = 0;
			
			// 구해진 중간 길이로 나눈 몫 카운트
			for (int i = 0; i < arr.length; i++) {
				count += (arr[i] / mid);
			}
			
			if(count < N) {
				max = mid;
			}
			else {
				min = mid + 1;
			}
		}
		
		// 최대 길이 == min -1
		System.out.println(min - 1);
	}
}