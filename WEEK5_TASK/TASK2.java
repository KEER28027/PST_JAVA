import java.util.Scanner;

class TASK2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int day = sc.nextInt();
        int month = sc.nextInt();

        int count = 0;

        for (int i = 0; i <= n - month; i++) {
            int sum = 0;

            for (int j = i; j < i + month; j++) {
                sum = sum + a[j];
            }

            if (sum == day) {
                count++;
            }
        }

        System.out.println(count);
    }
}