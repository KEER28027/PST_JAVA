import java.util.*;

public class WEEK10_TASK3_BROWSER_HISTORY_STACK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> history = new Stack<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            history.push(sc.next());
        }

        if (!history.isEmpty()) {
            System.out.println("Current: " + history.peek());
            history.pop();
        }

        System.out.println(history.isEmpty() ? "No previous page" : "Back: " + history.peek());
    }
}
