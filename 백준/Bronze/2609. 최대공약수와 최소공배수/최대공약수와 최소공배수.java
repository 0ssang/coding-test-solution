import java.io.*;
import java.util.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
 
		int d = gcd(a, b);
 
		System.out.println(d);
        // 최소공배수 구하는 공식 = a * b / 최대공약수
		System.out.println(a * b / d);
 
	}
 
	// 최대공약수 구하는 재귀
	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}