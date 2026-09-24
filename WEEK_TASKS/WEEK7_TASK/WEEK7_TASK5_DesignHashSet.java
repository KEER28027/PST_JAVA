import java.util.Scanner;
class SimpleHashSet {
    private boolean[] values = new boolean[1_000_001];
    void add(int key) { values[key] = true; }
    void remove(int key) { values[key] = false; }
    boolean contains(int key) { return values[key]; }
}
public class WEEK7_TASK5_DesignHashSet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SimpleHashSet set = new SimpleHashSet();
        System.out.print("Number of operations: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Operation (add/remove/contains) and key: ");
            String command = in.next();
            int key = in.nextInt();
            if (command.equals("add")) set.add(key);
            else if (command.equals("remove")) set.remove(key);
            else if (command.equals("contains")) System.out.println(set.contains(key));
            else System.out.println("Unknown operation.");
        }
    }
}