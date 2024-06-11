import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(true){
            long a = sc.nextInt();
            long b = sc.nextInt();
            long c = sc.nextInt();
            if(a+b+c == 0) break;
            if(a*a + b*b == c*c) {
                sb.append("right").append("\n");
            }else if(a*a + c*c == b*b){
                sb.append("right").append("\n");
            }else if(a*a == b*b + c*c){
                sb.append("right").append("\n");
            } else{
                sb.append("wrong").append("\n");
            }
        }
        System.out.println(sb);
    }
}