import java.util.*;

public class WEEK12_TASK3_TOP_K_FREQUENT_ELEMENTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            count.put(number, count.getOrDefault(number, 0) + 1);
        }

        ArrayList<Integer> numbers = new ArrayList<>(count.keySet());
        numbers.sort((a, b) -> count.get(b) - count.get(a));

        for (int i = 0; i < k && i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
