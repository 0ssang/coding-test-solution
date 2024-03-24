import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static double creditXgrade = 0;
    public static double creditSum = 0;
    public static double creditXgradeSum = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = 20;
        while(line-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if(!grade.equals("P")) {
                creditXgrade = getGrade(grade);
                creditXgrade = credit * creditXgrade;
                creditXgradeSum += creditXgrade;
                creditSum += credit;
            }
        }
        System.out.printf("%.6f", creditXgradeSum/creditSum);

    }
    public static double getGrade(String g){
        switch(g){
            case "A+" :
                return 4.5;
            case "A0" :
                return 4.0;
            case "B+" :
                return 3.5;
            case "B0" :
                return 3.0;
            case "C+" :
                return 2.5;
            case "C0" :
                return 2.0;
            case "D+" :
                return 1.5;
            case "D0" :
                return 1.0;
            case "F" :
                return 0.0;
        }
        return 0.0;
    }
}

