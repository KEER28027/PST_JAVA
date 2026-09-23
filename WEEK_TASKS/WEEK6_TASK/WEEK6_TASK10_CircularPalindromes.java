import java.util.Scanner;

public class WEEK6_TASK10_CircularPalindromes {
    static int longest(String s, int start) {
        int best = 1;
        int n = s.length();

        for (int center = 0; center < n; center++) {
            best = Math.max(best, expand(s, start, center, center));
            best = Math.max(best, expand(s, start, center, center + 1));
        }

        return best;
    }

    static int expand(String s, int start, int left, int right) {
        int best = 0;
        int n = s.length();

        while (left >= 0 && right < n && right - left + 1 <= n) {
            int firstIndex = (start + left) % n;
            int secondIndex = (start + right) % n;

            if (s.charAt(firstIndex) != s.charAt(secondIndex)) {
                break;
            }

            best = right - left + 1;
            left--;
            right++;
        }

        return best;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("String length: ");
        int n = in.nextInt();

        System.out.print("Enter string: ");
        String s = in.next();

        if (s.length() != n) {
            System.out.println("Length does not match.");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Rotation " + (i + 1) + ": " + longest(s, i));
        }
    }
}