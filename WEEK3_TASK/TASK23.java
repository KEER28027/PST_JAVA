import java.util.*;

public class TASK23 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(50);
        list.add(20);

        list.sort(Comparator.naturalOrder());

        System.out.println(list);
    }
}