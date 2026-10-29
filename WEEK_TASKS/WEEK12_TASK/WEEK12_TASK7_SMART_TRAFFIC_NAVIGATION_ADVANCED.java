import java.util.*;

public class WEEK12_TASK7_SMART_TRAFFIC_NAVIGATION_ADVANCED {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            graph.computeIfAbsent(from, key -> new HashSet<>()).add(to);
            graph.computeIfAbsent(to, key -> new HashSet<>()).add(from);
        }

        int source = sc.nextInt();
        int destination = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        queue.add(source);
        visited.add(source);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int next : graph.getOrDefault(current, new HashSet<>())) {
                if (visited.add(next)) {
                    queue.add(next);
                }
            }
        }
        System.out.println(visited.contains(destination) ? "YES" : "NO");
    }
}
