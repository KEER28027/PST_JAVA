import java.util.*;

public class WEEK11_TASK8_TWO_SUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        HashMap<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int needed = target - numbers[i];
            if (index.containsKey(needed)) {
                System.out.println(index.get(needed) + " " + i);
                return;
            }
            index.put(numbers[i], i);
        }
        System.out.println("No pair found");
    }
}
