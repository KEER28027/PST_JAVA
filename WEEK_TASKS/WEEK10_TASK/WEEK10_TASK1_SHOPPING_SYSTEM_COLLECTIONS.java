import java.util.*;

public class WEEK10_TASK1_SHOPPING_SYSTEM_COLLECTIONS {
    static class Order implements Comparable<Order> {
        String id;
        int priority;

        Order(String id, int priority) {
            this.id = id;
            this.priority = priority;
        }

        public int compareTo(Order other) {
            return other.priority - priority;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> products = new HashMap<>();

        int productCount = sc.nextInt();
        for (int i = 0; i < productCount; i++) {
            products.put(sc.next(), sc.next());
        }

        String searchId = sc.next();
        System.out.println(products.getOrDefault(searchId, "Product not found"));

        PriorityQueue<Order> orders = new PriorityQueue<>();
        int orderCount = sc.nextInt();
        for (int i = 0; i < orderCount; i++) {
            orders.add(new Order(sc.next(), sc.nextInt()));
        }

        while (!orders.isEmpty()) {
            System.out.println(orders.poll().id);
        }
    }
}
