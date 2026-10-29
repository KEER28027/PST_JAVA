import java.util.*;

public class WEEK12_TASK5_FREQUENCY_QUERIES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> valueFrequency = new HashMap<>();
        HashMap<Integer, Integer> frequencyCount = new HashMap<>();

        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            int type = sc.nextInt();
            int value = sc.nextInt();

            if (type == 1) {
                int oldFrequency = valueFrequency.getOrDefault(value, 0);
                int newFrequency = oldFrequency + 1;
                valueFrequency.put(value, newFrequency);
                if (oldFrequency > 0) {
                    frequencyCount.put(oldFrequency, frequencyCount.get(oldFrequency) - 1);
                }
                frequencyCount.put(newFrequency, frequencyCount.getOrDefault(newFrequency, 0) + 1);
            } else if (type == 2 && valueFrequency.getOrDefault(value, 0) > 0) {
                int oldFrequency = valueFrequency.get(value);
                int newFrequency = oldFrequency - 1;
                valueFrequency.put(value, newFrequency);
                frequencyCount.put(oldFrequency, frequencyCount.get(oldFrequency) - 1);
                if (newFrequency > 0) {
                    frequencyCount.put(newFrequency, frequencyCount.getOrDefault(newFrequency, 0) + 1);
                }
            } else if (type == 3) {
                System.out.println(frequencyCount.getOrDefault(value, 0) > 0 ? 1 : 0);
            }
        }
    }
}
