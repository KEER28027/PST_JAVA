import java.util.HashSet;

public class WEEK2_TASK5_HashSetOperations {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);

        System.out.println(numbers);
        System.out.println(numbers.contains(20));

        numbers.remove(10);
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
