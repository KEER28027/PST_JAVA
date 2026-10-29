import java.util.*;

public class WEEK12_TASK8_TOP_K_FREQUENT_WORDS_LEXICOGRAPHICAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<String, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> words = new ArrayList<>(count.keySet());
        words.sort((a, b) -> {
            int result = count.get(b) - count.get(a);
            return result != 0 ? result : a.compareTo(b);
        });

        for (int i = 0; i < k && i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}
