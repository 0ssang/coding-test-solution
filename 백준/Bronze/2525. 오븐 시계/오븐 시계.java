import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int curHour = stdIn.nextInt();
        int curMin = stdIn.nextInt();
        int cookingT = stdIn.nextInt();

        int endHour = (curHour + (curMin + cookingT) / 60) % 24;
        int endMin = (curMin + cookingT) % 60;
        System.out.println(endHour + " " + endMin);
    }
}