import java.util.*;

public class WEEK4_TASK3_COMPARE_TRIPLETS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0;

        for (int i = 0; i < 3; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > y)
                a++;
            else if (x < y)
                b++;
        }

        System.out.println(a + " " + b);
    }
}
