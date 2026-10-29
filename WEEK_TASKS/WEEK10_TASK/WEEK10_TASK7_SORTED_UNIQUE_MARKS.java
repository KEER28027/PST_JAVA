import java.util.*;

public class WEEK10_TASK7_SORTED_UNIQUE_MARKS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> marks = new TreeSet<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            marks.add(sc.nextInt());
        }

        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}
