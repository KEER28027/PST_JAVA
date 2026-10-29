import java.util.*;

public class WEEK12_TASK4_GROUP_ANAGRAMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, ArrayList<String>> groups = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String key = new String(letters);
            groups.computeIfAbsent(key, value -> new ArrayList<>()).add(word);
        }

        for (ArrayList<String> group : groups.values()) {
            System.out.println(group);
        }
    }
}
