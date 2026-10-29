import java.util.*;

public class WEEK11_TASK4_SECOND_LOWEST_GRADE_STUDENTS {
    static class Student {
        String name;
        double grade;

        Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = new ArrayList<>();
        TreeSet<Double> grades = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());
            students.add(new Student(name, grade));
            grades.add(grade);
        }

        grades.pollFirst();
        double secondLowest = grades.first();
        ArrayList<String> names = new ArrayList<>();
        for (Student student : students) {
            if (student.grade == secondLowest) {
                names.add(student.name);
            }
        }

        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
