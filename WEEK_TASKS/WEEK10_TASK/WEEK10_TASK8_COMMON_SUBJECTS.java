import java.util.*;

public class WEEK10_TASK8_COMMON_SUBJECTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> firstStudent = new HashSet<>();
        HashSet<String> secondStudent = new HashSet<>();

        int firstCount = sc.nextInt();
        for (int i = 0; i < firstCount; i++) {
            firstStudent.add(sc.next());
        }

        int secondCount = sc.nextInt();
        for (int i = 0; i < secondCount; i++) {
            secondStudent.add(sc.next());
        }

        firstStudent.retainAll(secondStudent);
        System.out.println(firstStudent);
    }
}
