import java.util.Arrays;
import java.util.List;

public class T8 {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(55, 78, 82, 91, 67, 74, 88, 76);

        long countAbove75 = scores.stream()
            .filter(score -> score > 75)
            .count();

        System.out.println("Number of students scoring above 75: " + countAbove75);
    }
}
