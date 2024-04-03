import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] sub = sc.nextLine().split("-");
        int temp = Integer.MAX_VALUE;
        for(int i = 0; i < sub.length; i++){
            int sum = 0;
            String[] add = sub[i].split("\\+");
            for(int j = 0; j < add.length; j++){
                sum += Integer.parseInt(add[j]);
            }
            if(temp == Integer.MAX_VALUE){
                temp = sum;
            }else {
                temp -= sum;
            }
        }
        System.out.println(temp);
    }
}
