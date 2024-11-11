import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        String[] strArr = input.split(" ");
        int[] intArr = new int[strArr.length];
        
        for(int i=0; i<intArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        
        Arrays.sort(intArr);
        
        System.out.println(intArr[1]);
        
    }
}