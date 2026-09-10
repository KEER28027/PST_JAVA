import java.util.Scanner;

public class SYLLABUS_TASK3_MaximumProfitAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int currentSum = input.nextInt();
        int maximumSum = currentSum;

        for (int i = 1; i < n; i++) {
            int value = input.nextInt();
            currentSum = Math.max(value, currentSum + value);
            maximumSum = Math.max(maximumSum, currentSum);
        }
        System.out.println(maximumSum);
    }
}
