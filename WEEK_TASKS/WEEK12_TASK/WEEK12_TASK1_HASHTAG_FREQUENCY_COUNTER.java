import java.util.*;

public class WEEK12_TASK1_HASHTAG_FREQUENCY_COUNTER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> frequency = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String hashtag = sc.next();
            frequency.put(hashtag, frequency.getOrDefault(hashtag, 0) + 1);
        }

        ArrayList<String> hashtags = new ArrayList<>(frequency.keySet());
        hashtags.sort((a, b) -> {
            int result = frequency.get(b) - frequency.get(a);
            return result != 0 ? result : a.compareTo(b);
        });

        for (String hashtag : hashtags) {
            System.out.println(hashtag + " " + frequency.get(hashtag));
        }
    }
}
