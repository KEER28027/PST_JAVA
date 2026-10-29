import java.util.*;

public class WEEK10_TASK2_STUDENT_MARKS_DYNAMIC_ARRAY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            marks.add(sc.nextInt());
        }

        System.out.println(marks);
    }
}
