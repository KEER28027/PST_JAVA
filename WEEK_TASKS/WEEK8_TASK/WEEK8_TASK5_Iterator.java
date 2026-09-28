import java.util.*;

public class WEEK8_TASK5_Iterator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) return;

        int numberCount = in.nextInt();
        for (int i = 0; i < numberCount && in.hasNextInt(); i++) {
            in.nextInt();
        }

        // Read the remaining part of the number line, or the next line if it is empty.
        String textLine = in.nextLine().trim();
        if (textLine.isEmpty() && in.hasNextLine()) {
            textLine = in.nextLine().trim();
        }

        // Some input formats include a count before the words.
        if (textLine.matches("\\d+")) {
            textLine = in.hasNextLine() ? in.nextLine().trim() : "";
        }

        String[] words = textLine.split("\\s+");
        int marker = -1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("###")) {
                marker = i;
                break;
            }
        }
        int start = marker >= 0 ? marker + 1 : 0;
        for (int i = start; i < words.length; i++) {
            if (!words[i].isEmpty()) System.out.println(words[i]);
        }
        in.close();
    }
}
