import java.util.*;

public class WEEK10_TASK9_STUDENT_MARKS_HASHMAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> marks = new HashMap<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            marks.put(sc.nextInt(), sc.nextInt());
        }

        int rollNumber = sc.nextInt();
        System.out.println(marks.getOrDefault(rollNumber, -1));
    }
}
