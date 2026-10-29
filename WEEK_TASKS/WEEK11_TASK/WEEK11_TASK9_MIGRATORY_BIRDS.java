import java.util.*;

public class WEEK11_TASK9_MIGRATORY_BIRDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> count = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            int bird = sc.nextInt();
            count.put(bird, count.getOrDefault(bird, 0) + 1);
        }

        int answer = -1;
        int maxCount = 0;
        for (int bird : count.keySet()) {
            if (count.get(bird) > maxCount) {
                maxCount = count.get(bird);
                answer = bird;
            }
        }
        System.out.println(answer);
    }
}
