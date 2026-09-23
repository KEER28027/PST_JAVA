import java.util.Scanner;

public class WEEK6_TASK8_FirstOccurrence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Main string: ");
        String s = in.next();

        System.out.print("Word to find: ");
        String p = in.next();

        System.out.println("First position (-1 if absent): " + s.indexOf(p));
    }
}