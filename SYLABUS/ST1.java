import java.util.*;

public class ST1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> salary = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            salary.add(sc.nextInt());
        }

        salary.stream()
              .map(x -> x + x / 10)
              .forEach(x -> System.out.print(x + " "));
    }
}