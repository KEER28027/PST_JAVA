import java.util.Arrays;

public class WEEK2_TASK1_ArrayPermutation {
    static int[] buildArray(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[numbers[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 0, 2, 1, 3};
        System.out.println(Arrays.toString(buildArray(numbers)));
    }
}
