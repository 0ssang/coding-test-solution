import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            list.add(Character.getNumericValue(str.charAt(i)));
        }

        Collections.sort(list, Collections.reverseOrder());
        for(Integer e : list){
            sb.append(e);
        }
        System.out.println(sb);
    }
}