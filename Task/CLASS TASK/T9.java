import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class T9 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 25, 30, 12, 45, 50, 25, 60);

        List<Integer> unique = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("After removing duplicates: " + unique);

        List<Integer> greaterThan20 = unique.stream()
                .filter(n -> n > 20)
                .collect(Collectors.toList());
        System.out.println("After filtering > 20: " + greaterThan20);

        List<Integer> doubled = greaterThan20.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("After multiplying by 2: " + doubled);

        List<Integer> sorted = doubled.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("After sorting ascending: " + sorted);
    }
}
