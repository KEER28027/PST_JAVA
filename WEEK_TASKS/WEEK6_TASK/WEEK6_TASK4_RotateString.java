import java.util.Scanner;

public class WEEK6_TASK4_RotateString {
    static boolean rotation(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Original string: ");
        String s = in.next();

        System.out.print("Target string: ");
        String g = in.next();

        System.out.println("Is rotation: " + rotation(s, g));
    }
}