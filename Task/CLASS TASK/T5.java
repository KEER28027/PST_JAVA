import java.util.Arrays;
import java.util.List;

public class T5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> squares = Arrays.asList(
            numbers.get(0) * numbers.get(0),
            numbers.get(1) * numbers.get(1),
            numbers.get(2) * numbers.get(2),
            numbers.get(3) * numbers.get(3),
            numbers.get(4) * numbers.get(4)
        );
        System.out.println(squares);
    }
}
 