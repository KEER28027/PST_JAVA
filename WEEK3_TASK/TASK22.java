import java.util.*;

public class TASK22 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(50);
        list.add(20);
        list.add(80);
        list.add(30);

        int max = list.get(0);

        for (int n : list) {
            if (n > max) {
                max = n;
            }
        }

        System.out.println("Largest number: " + max);
    }
}