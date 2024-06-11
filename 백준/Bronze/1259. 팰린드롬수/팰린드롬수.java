import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String str = br.readLine();
            if(str.equals("0")) break;
            StringBuilder s = new StringBuilder(str);
            if(str.equals(s.reverse().toString())) sb.append("yes").append('\n');
            else sb.append("no").append('\n');
        }
        System.out.println(sb);

    }
}