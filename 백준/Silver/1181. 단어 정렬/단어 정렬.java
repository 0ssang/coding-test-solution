import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        List<String> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            list.add(sc.nextLine());
        }

        List<String> sortedList = list.stream()
                .distinct()
                .sorted((s1, s2) -> {
                    if(s1.length() != s2.length()){
                        return Integer.compare(s1.length(), s2.length());
                    } else {
                        return s1.compareTo(s2);
                    }
                })
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }
}
