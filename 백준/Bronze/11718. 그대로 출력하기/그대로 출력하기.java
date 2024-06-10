import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Scanner를 사용한 방법
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            System.out.println(scanner.nextLine());
//        }
        // BufferedReader를 사용한 방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String str = br.readLine();
            if(str == null || str.isEmpty()) break;
            sb.append(str).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}