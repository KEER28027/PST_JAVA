import java.util.*;

public class WEEK11_TASK3_DEGREE_OF_ARRAY {
    public static int shortestSubarray(int[] numbers) {
        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        int degree = 0;
        int answer = numbers.length;

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            first.putIfAbsent(number, i);
            count.put(number, count.getOrDefault(number, 0) + 1);

            int frequency = count.get(number);
            if (frequency > degree) {
                degree = frequency;
                answer = i - first.get(number) + 1;
            } else if (frequency == degree) {
                answer = Math.min(answer, i - first.get(number) + 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(shortestSubarray(numbers));
    }
}
