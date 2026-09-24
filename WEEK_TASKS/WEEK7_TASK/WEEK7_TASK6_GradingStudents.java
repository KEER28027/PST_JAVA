import java.util.Scanner;
public class WEEK7_TASK6_GradingStudents {
    static int roundGrade(int grade) {
        if (grade < 38) return grade;
        int nextMultiple = ((grade / 5) + 1) * 5;
        return nextMultiple - grade < 3 ? nextMultiple : grade;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Grade: ");
            System.out.println(roundGrade(in.nextInt()));
        }
    }
}