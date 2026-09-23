import java.util.Scanner;

public class WEEK6_TASK5_MarsExploration {
    static int changes(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != "SOS".charAt(i % 3)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Received message: ");
        String s = in.next();

        System.out.println("Changed letters: " + changes(s));
    }
}