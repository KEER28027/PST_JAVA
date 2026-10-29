import java.util.*;

public class WEEK10_TASK4_STUDENT_MARKS_ARRAYLIST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            marks.add(sc.nextInt());
        }

        System.out.println("Marks: " + marks);
        System.out.println("Highest: " + Collections.max(marks));

        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        System.out.println("Average: " + (total / (double) marks.size()));
    }
}
