import java.util.*;

public class TASK7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int left = 0, right = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();

                if (i == j)
                    left += x;

                if (i + j == n - 1)
                    right += x;
            }
        }

        System.out.println(Math.abs(left - right));
    }
}