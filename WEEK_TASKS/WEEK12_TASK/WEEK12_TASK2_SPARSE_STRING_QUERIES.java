import java.util.*;

public class WEEK12_TASK2_SPARSE_STRING_QUERIES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> count = new HashMap<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String text = sc.next();
            count.put(text, count.getOrDefault(text, 0) + 1);
        }

        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            System.out.println(count.getOrDefault(sc.next(), 0));
        }
    }
}
