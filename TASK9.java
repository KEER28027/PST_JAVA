import java.util.*;

public class TASK9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();

        int[][] a = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                int sum = 0;

                for (int x = Math.max(0, i - k);
                     x <= Math.min(r - 1, i + k); x++) {

                    for (int y = Math.max(0, j - k);
                         y <= Math.min(c - 1, j + k); y++) {

                        sum += a[x][y];
                    }
                }

                System.out.print(sum + " ");
            }

            System.out.println();
        }
    }
}