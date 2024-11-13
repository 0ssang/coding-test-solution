import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        Set<String> set = new TreeSet<>(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        for(int i=0; i<N; i++){
            set.add(br.readLine());
        }
        
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            sb.append(iter.next()).append('\n');
        }
        System.out.println(sb.toString());
        
    }
}