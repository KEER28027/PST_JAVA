import java.util.*;

public class WEEK3_TASK7_LARGEST_NUMBER {
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
