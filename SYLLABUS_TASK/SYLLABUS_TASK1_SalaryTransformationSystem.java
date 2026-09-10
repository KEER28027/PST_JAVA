import java.util.Scanner;

public class SYLLABUS_TASK1_SalaryTransformationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int salary = input.nextInt();
            int newSalary = salary * 110 / 100;
            System.out.print(newSalary + " ");
        }
    }
}
