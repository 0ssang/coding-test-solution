import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        while(true){
            String line = sc.nextLine();
            if(line.equals("#")) break;
            
            int count = line.replaceAll("[^aeiouAEIOU]", "").length();
            sb.append(count).append('\n');
        }
        sc.close();
        
        System.out.println(sb);
    }
}