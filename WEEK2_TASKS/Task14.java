import java.util.ArrayDeque;
import java.util.Deque;

public class Task14 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(10);
        deque.addLast(20);
        deque.offerFirst(5);
        deque.offerLast(30);

        System.out.println(deque.peekFirst()); // 5
        System.out.println(deque.peekLast());  // 30

        int first = deque.removeFirst(); // 5
        int last = deque.removeLast();   // 30

        System.out.println(deque); // [10, 20]
    }
}