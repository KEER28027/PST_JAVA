import java.util.Scanner;

public class WEEK6_TASK1_StringSimilarity {
    static int match(String s, int start) {
        int count = 0;

        while (start + count < s.length() && s.charAt(count) == s.charAt(start + count)) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of strings: ");
        int t = in.nextInt();

        while (t-- > 0) {
            System.out.print("String: ");
            String s = in.next();

            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += match(s, i);
            }

            System.out.println("Similarity total: " + sum);
        }
    }
}