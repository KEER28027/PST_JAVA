import java.util.Scanner;

public class SYLLABUS_TASK4_IntelligentDNAPatternSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();
        String pattern = input.next();
        int[] lps = makeLps(pattern);
        int i = 0, j = 0;

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == pattern.length()) {
                    System.out.print((i - j) + " ");
                    j = lps[j - 1];
                }
            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }
    }

    static int[] makeLps(String pattern) {
        int[] lps = new int[pattern.length()];
        int length = 0;
        for (int i = 1; i < pattern.length();) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                lps[i++] = ++length;
            } else if (length > 0) {
                length = lps[length - 1];
            } else {
                lps[i++] = 0;
            }
        }
        return lps;
    }
}
