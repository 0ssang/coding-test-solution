import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();
        while(N > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String op = st.nextToken();
            if(op.equals("push")){
                int x = Integer.parseInt(st.nextToken());
                list.add(x);
            }else if(op.equals("pop")){
                if(!list.isEmpty()){
                    sb.append(list.removeFirst()).append("\n");
                }else{
                    sb.append(-1).append("\n");
                }
            }else if(op.equals("size")){
                sb.append(list.size()).append("\n");
            }else if(op.equals("empty")){
                if(list.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }else if(op.equals("front")){
                if(!list.isEmpty()) sb.append(list.getFirst()).append("\n");
                else sb.append(-1).append("\n");
            }else if(op.equals("back")){
                if(!list.isEmpty()) sb.append(list.getLast()).append("\n");
                else sb.append(-1).append("\n");
            }
            N--;
        }
        System.out.println(sb);
    }
}