import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        while(true){
            String line = sc.nextLine();
            if(line.equals("0")) break;
            
            boolean isPall = true;
            int start = 0;
            int end = line.length() - 1;
            if(line.length() > 1) {
                while(start < end){
                    if(line.charAt(start) != line.charAt(end)){
                        isPall = false;
                        break;
                    }
                    start++;
                    end--;
                }
            }
            if(isPall){
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append('\n');
        }
        sc.close();    
        System.out.println(sb);
    }
}