import java.util.*;

public class ST2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String id = sc.next();
            int temp = sc.nextInt();

            if (temp > 50) {
                map.putIfAbsent(id, new ArrayList<>());
                map.get(id).add(temp);
            }
        }

        List<String> sensors = new ArrayList<>(map.keySet());

        sensors.sort((a, b) -> {
            double avgA = average(map.get(a));
            double avgB = average(map.get(b));
            return Double.compare(avgB, avgA);
        });

        for (String id : sensors) {
            System.out.println(id + " " + average(map.get(id)));
        }
    }

    static double average(List<Integer> list) {
        int sum = 0;

        for (int x : list)
            sum += x;

        return (double) sum / list.size();
    }
}