import java.util.*;

public class WEEK12_TASK9_STUDENT_MARKS_INDEXING_SYSTEM {
    static class Student {
        String name;
        double marks;

        Student(String name, double marks) {
            this.name = name;
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String id = sc.next();
            students.put(id, new Student(sc.next(), sc.nextDouble()));
        }

        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            Student student = students.get(sc.next());
            if (student == null) {
                System.out.println("Student not found");
            } else {
                System.out.println(student.name + " " + student.marks);
            }
        }
    }
}
