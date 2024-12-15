import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st_1 = new StringTokenizer(str, "0");
        StringTokenizer st_2 = new StringTokenizer(str, "1");

        System.out.println(Math.min(st_1.countTokens(), st_2.countTokens()));
    }
}