import java.util.*;

public class WEEK11_TASK5_JAVA_ARRAYLIST_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int size = sc.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                line.add(sc.nextInt());
            }
            lines.add(line);
        }

        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            if (x >= 0 && x < lines.size() && y >= 0 && y < lines.get(x).size()) {
                System.out.println(lines.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
