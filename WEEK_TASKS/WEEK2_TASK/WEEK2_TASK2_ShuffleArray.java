import java.util.Arrays;

public class WEEK2_TASK2_ShuffleArray {
    static int[] shuffle(int[] numbers, int n) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < n; i++) {
            result[2 * i] = numbers[i];
            result[2 * i + 1] = numbers[i + n];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 5, 1, 3, 4, 7};
        System.out.println(Arrays.toString(shuffle(numbers, 3)));
    }
}
