import java.util.*;

public class WEEK11_TASK2_FIRST_UNIQUE_CHARACTER {
    public static int firstUniqueCharacter(String text) {
        HashMap<Character, Integer> count = new HashMap<>();

        for (char ch : text.toCharArray()) {
            count.put(ch, count.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < text.length(); i++) {
            if (count.get(text.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(firstUniqueCharacter(sc.next()));
    }
}
