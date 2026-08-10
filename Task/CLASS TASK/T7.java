import java.util.Arrays;
import java.util.List;

public class T7 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        int total = 0;
        int max = numbers.get(0);
        int min = numbers.get(0);

        for (int number : numbers) {
            total += number;
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        double average = (double) total / numbers.size();

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
