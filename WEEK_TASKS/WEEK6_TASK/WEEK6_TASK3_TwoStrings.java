import java.util.Scanner;

public class WEEK6_TASK3_TwoStrings {
    static boolean share(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (b.indexOf(a.charAt(i)) >= 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of pairs: ");
        int t = in.nextInt();

        while (t-- > 0) {
            System.out.print("First string: ");
            String a = in.next();

            System.out.print("Second string: ");
            String b = in.next();

            System.out.println(share(a, b) ? "YES" : "NO");
        }
    }
}