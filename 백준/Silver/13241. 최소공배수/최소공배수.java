import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        System.out.println((a*b)/gdc(a,b));
    }
    static long gdc(long x, long y){
        if(x % y == 0) return y;
        return gdc(y, x%y);
    }
}