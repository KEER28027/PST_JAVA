import java.util.Scanner;

public class WEEK6_TASK9_LongestPalindromicSubstring {
    static String longest(String s) {
        int start = 0;
        int bestLength = 0;

        for (int center = 0; center < s.length(); center++) {
            int[] odd = expand(s, center, center);
            int[] even = expand(s, center, center + 1);

            if (odd[1] > bestLength) {
                start = odd[0];
                bestLength = odd[1];
            }

            if (even[1] > bestLength) {
                start = even[0];
                bestLength = even[1];
            }
        }

        return s.substring(start, start + bestLength);
    }

    static int[] expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return new int[] { left + 1, right - left - 1 };
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = in.next();

        System.out.println("Longest palindrome: " + longest(s));
    }
}