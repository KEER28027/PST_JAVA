import java.util.*;

class ST6 {
    static int fare(String type, int d) {
        if (type.equals("Bike")) return d * 5;
        if (type.equals("Auto")) return d * 12;
        if (type.equals("Cab")) return d * 12;
        throw new IllegalArgumentException("Invalid ride");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int distance = sc.nextInt();

            try {
                System.out.println(fare(type, distance));
            } catch (Exception e) {
                System.out.println("Invalid Booking");
            }
        }
    }
}