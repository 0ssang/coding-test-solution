import java.util.*;
import java.io.*;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        list.add(arr[0]);

        for(int i=0; i<arr.length; i++){
            int val = arr[i];
            if(list.get(list.size()-1) < val) {
                list.add(arr[i]);
            }else {
                int lo = 0;
                int hi = list.size() - 1;
                while(lo < hi){
                    int mid = (lo + hi) >> 1;
                    if(list.get(mid) < val){
                        lo = mid + 1;
                    }else {
                        hi = mid;
                    }
                }
                list.set(lo, val);
            }
        }

        System.out.println(list.size());
    }
}