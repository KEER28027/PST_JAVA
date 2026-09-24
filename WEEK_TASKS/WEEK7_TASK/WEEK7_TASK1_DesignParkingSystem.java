import java.util.Scanner;
class ParkingLot {
    private int[] spaces;
    ParkingLot(int big, int medium, int small) {
        spaces = new int[]{0, big, medium, small};
    }
    boolean addCar(int type) {
        if (type < 1 || type > 3 || spaces[type] == 0) return false;
        spaces[type]--;
        return true;
    }
}
public class WEEK7_TASK1_DesignParkingSystem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Big, medium, small spaces: ");
        ParkingLot lot = new ParkingLot(in.nextInt(), in.nextInt(), in.nextInt());
        System.out.print("Number of cars arriving: ");
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Car type (1 big, 2 medium, 3 small): ");
            System.out.println(lot.addCar(in.nextInt()));
        }
    }
}