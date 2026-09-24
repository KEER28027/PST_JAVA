import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class TrainTracker {
    private Map<Integer, String> startStation = new HashMap<>();
    private Map<Integer, Integer> startTime = new HashMap<>();
    private Map<String, int[]> trips = new HashMap<>();
    void checkIn(int id, String station, int time) {
        startStation.put(id, station);
        startTime.put(id, time);
    }
    void checkOut(int id, String station, int time) {
        String route = startStation.remove(id) + "->" + station;
        int duration = time - startTime.remove(id);
        int[] values = trips.getOrDefault(route, new int[2]);
        values[0] += duration;
        values[1]++;
        trips.put(route, values);
    }
    double average(String from, String to) {
        int[] values = trips.get(from + "->" + to);
        return (double) values[0] / values[1];
    }
}
public class WEEK7_TASK3_DesignUndergroundSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TrainTracker system = new TrainTracker();
        System.out.print("Number of operations: ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Operation (in / out / average): ");
            String command = in.next();
            if (command.equals("in")) {
                System.out.print("ID station time: ");
                system.checkIn(in.nextInt(), in.next(), in.nextInt());
            } else if (command.equals("out")) {
                System.out.print("ID station time: ");
                system.checkOut(in.nextInt(), in.next(), in.nextInt());
            } else if (command.equals("average")) {
                System.out.print("Start and end stations: ");
                System.out.println(system.average(in.next(), in.next()));
            } else System.out.println("Unknown operation.");
        }
    }
}