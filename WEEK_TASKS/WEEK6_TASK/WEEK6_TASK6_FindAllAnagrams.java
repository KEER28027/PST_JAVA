import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WEEK6_TASK6_FindAllAnagrams {
    static List<Integer> positions(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int windowSize = p.length();

        for (int start = 0; start + windowSize <= s.length(); start++) {
            int[] count = new int[26];

            for (int i = 0; i < windowSize; i++) {
                count[p.charAt(i) - 'a']++;
                count[s.charAt(start + i) - 'a']--;
            }

            boolean isAnagram = true;
            for (int value : count) {
                if (value != 0) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                result.add(start);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Main string (lowercase): ");
        String s = in.next();

        System.out.print("Pattern (lowercase): ");
        String p = in.next();

        System.out.println("Positions: " + positions(s, p));
    }
}