import java.util.Scanner;

public class WEEK6_TASK7_PalindromeIndex {
    static boolean palindrome(String s, int skip) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (left == skip) {
                left++;
            } else if (right == skip) {
                right--;
            } else if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }

    static int index(String s) {
        if (palindrome(s, -1)) {
            return -1;
        }

        for (int i = 0; i < s.length(); i++) {
            if (palindrome(s, i)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of strings: ");
        int t = in.nextInt();

        while (t-- > 0) {
            System.out.print("String: ");
            String s = in.next();
            System.out.println("Index to remove: " + index(s));
        }
    }
}