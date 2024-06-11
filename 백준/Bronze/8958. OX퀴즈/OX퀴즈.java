import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T = sc.nextInt();
        while(T > 0){
            String str = sc.next();
            int score = 0;
            int total = 0;
            for(char c : str.toCharArray()){
                if(c == 'O'){
                    total += ++score;
                }else{
                    score = 0;
                }
            }
            sb.append(total).append("\n");
            T--;
        }
        System.out.println(sb);
    }
}