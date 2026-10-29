import java.util.*;

public class WEEK10_TASK6_UNIQUE_PURCHASED_ITEMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> items = new LinkedHashSet<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            items.add(sc.next());
        }

        for (String item : items) {
            System.out.println(item);
        }
    }
}
