import java.util.Scanner;

public class WEEK6_TASK2_RepeatedSubstringPattern {
    static boolean repeated(String s) {
        for (int length = 1; length <= s.length() / 2; length++) {
            if (s.length() % length == 0) {
                String pattern = s.substring(0, length);
                if (pattern.repeat(s.length() / length).equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = in.next();

        System.out.println("Repeated pattern: " + repeated(s));
    }
}