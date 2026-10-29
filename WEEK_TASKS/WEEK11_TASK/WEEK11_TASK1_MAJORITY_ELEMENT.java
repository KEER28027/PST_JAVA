import java.util.*;

public class WEEK11_TASK1_MAJORITY_ELEMENT {
    public static int majorityElement(int[] numbers) {
        int candidate = numbers[0];
        int count = 0;

        for (int number : numbers) {
            if (count == 0) {
                candidate = number;
            }
            count += (number == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(majorityElement(numbers));
    }
}
