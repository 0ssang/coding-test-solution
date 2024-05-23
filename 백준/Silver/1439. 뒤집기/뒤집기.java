import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++){
            if(i == 0 || str.charAt(i) != str.charAt(i - 1)) sb.append(str.charAt(i));
        }
        System.out.println(sb.toString().length() /2);
    }
}