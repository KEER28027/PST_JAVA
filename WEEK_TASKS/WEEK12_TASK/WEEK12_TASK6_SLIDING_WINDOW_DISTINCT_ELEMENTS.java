import java.util.*;

public class WEEK12_TASK6_SLIDING_WINDOW_DISTINCT_ELEMENTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < k; i++) {
            count.put(numbers[i], count.getOrDefault(numbers[i], 0) + 1);
        }

        int maximum = count.size();
        for (int i = k; i < n; i++) {
            int outgoing = numbers[i - k];
            count.put(outgoing, count.get(outgoing) - 1);
            if (count.get(outgoing) == 0) {
                count.remove(outgoing);
            }
            count.put(numbers[i], count.getOrDefault(numbers[i], 0) + 1);
            maximum = Math.max(maximum, count.size());
        }
        System.out.println(maximum);
    }
}
