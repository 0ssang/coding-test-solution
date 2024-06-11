import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 0;
        while(t > 0){
            if(isPrime(sc.nextInt())) cnt++;
            t--;
        }
        System.out.println(cnt);
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