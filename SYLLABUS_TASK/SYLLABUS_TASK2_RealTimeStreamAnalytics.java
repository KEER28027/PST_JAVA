import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SYLLABUS_TASK2_RealTimeStreamAnalytics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Map<String, Integer> total = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String sensorId = input.next();
            int temperature = input.nextInt();
            if (temperature > 50) {
                total.put(sensorId, total.getOrDefault(sensorId, 0) + temperature);
                count.put(sensorId, count.getOrDefault(sensorId, 0) + 1);
            }
        }

        ArrayList<String> sensors = new ArrayList<>(total.keySet());
        Collections.sort(sensors, new Comparator<String>() {
            public int compare(String a, String b) {
                double averageA = (double) total.get(a) / count.get(a);
                double averageB = (double) total.get(b) / count.get(b);
                return Double.compare(averageB, averageA);
            }
        });

        for (String sensor : sensors) {
            double average = (double) total.get(sensor) / count.get(sensor);
            System.out.println(sensor + " " + average);
        }
    }
}
