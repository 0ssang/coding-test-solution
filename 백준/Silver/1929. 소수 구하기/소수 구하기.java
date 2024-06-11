import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int s = sc.nextInt();
        int e = sc.nextInt();
        for(int i=s; i<=e; i++){
            if(isPrime(i)) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
    static boolean isPrime(int n){
        if(n == 0 || n == 1) return false;
        if (n == 2) return true;
        for(int i=2; i<=(int)Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}