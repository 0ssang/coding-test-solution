import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = 0;
        for(int i=0; i<3; i++){
            String str = br.readLine();
            if(isNumber(str)){
                target = Integer.parseInt(str)+ (3 - i);
            }
        }
        System.out.println(fizzBuzz(target));
    }
     static String fizzBuzz(int i){
        if(i % 3 == 0){
            if(i % 5 == 0){
                return "FizzBuzz";
            }else {
                return "Fizz";
            }
        }else if(i % 5 == 0){
            return "Buzz";
        }

        return String.valueOf(i);
     }
     static boolean isNumber(String str){
         return !str.equals("Fizz") && !str.equals("Buzz") && !str.equals("FizzBuzz");
     }
}