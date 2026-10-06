import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SYLLABUS_TASK8_SmartTrafficNavigationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<ArrayList<Integer>> roads = new ArrayList<>();
        for (int i = 0; i <= n; i++) roads.add(new ArrayList<Integer>());

        for (int i = 0; i < m; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            roads.get(a).add(b);
            roads.get(b).add(a);
        }
        int source = input.nextInt();
        int destination = input.nextInt();
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            int current = queue.remove();
            for (int next : roads.get(current)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
        System.out.println(visited[destination] ? "YES" : "NO");
    }
}
