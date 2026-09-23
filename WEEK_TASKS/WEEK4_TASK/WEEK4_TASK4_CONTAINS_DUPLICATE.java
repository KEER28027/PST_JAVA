import java.util.*;

public class WEEK4_TASK4_CONTAINS_DUPLICATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();

        boolean duplicate = false;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (set.contains(x))
                duplicate = true;

            set.add(x);
        }

        System.out.println(duplicate);
    }
}
