import java.util.ArrayDeque;
import java.util.Deque;

public class WEEK2_TASK4_DequeOperations {
    public static void main(String[] args) {
        Deque<Integer> numbers = new ArrayDeque<>();
        numbers.addFirst(10);
        numbers.addLast(20);
        numbers.offerFirst(5);
        numbers.offerLast(30);

        System.out.println(numbers.peekFirst());
        System.out.println(numbers.peekLast());

        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers);
    }
}
