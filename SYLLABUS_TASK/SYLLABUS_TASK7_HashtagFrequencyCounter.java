import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SYLLABUS_TASK7_HashtagFrequencyCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Map<String, Integer> frequency = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String hashtag = input.next();
            frequency.put(hashtag, frequency.getOrDefault(hashtag, 0) + 1);
        }

        for (String hashtag : frequency.keySet()) {
            System.out.println(hashtag + " " + frequency.get(hashtag));
        }
    }
}
