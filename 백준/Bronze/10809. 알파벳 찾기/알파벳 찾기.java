import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        final int ASCII = 97;
        final int AZ = 26;
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        String str = br.readLine();
        char[] abc = str.toCharArray();

        for(int i = 0; i < abc.length; i++){
            for(int j = ASCII; j < ASCII+AZ; j++){
                if(arr[j-ASCII] == -1) {
                    if ((int) abc[i] == j) {
                        arr[j - ASCII] = i;
                        break;
                    }
                }
            }
        }
        for(int i : arr){
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}