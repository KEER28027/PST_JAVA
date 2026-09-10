import java.util.Scanner;

public class SYLLABUS_TASK6_RideSharingPlatformSimulator {
    static abstract class Ride {
        abstract int calculateFare(int distance);
    }

    static class Bike extends Ride {
        int calculateFare(int distance) { return distance * 5; }
    }

    static class Auto extends Ride {
        int calculateFare(int distance) { return distance * 12; }
    }

    static class Cab extends Ride {
        int calculateFare(int distance) { return distance * 12; }
    }

    static Ride getRide(String type) throws Exception {
        if (type.equalsIgnoreCase("Bike")) return new Bike();
        if (type.equalsIgnoreCase("Auto")) return new Auto();
        if (type.equalsIgnoreCase("Cab")) return new Cab();
        throw new Exception("Invalid booking");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            String type = input.next();
            int distance = input.nextInt();
            try {
                Ride ride = getRide(type);
                System.out.println(ride.calculateFare(distance));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
