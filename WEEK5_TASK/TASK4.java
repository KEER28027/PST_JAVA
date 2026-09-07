import java.util.Scanner;

class TASK4 {

    static int kadane(int[] a) {
        int current = a[0];
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            current = Math.max(a[i], current + a[i]);
            max = Math.max(max, current);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int normalMax = kadane(a);

        int total = 0;

        for (int i = 0; i < n; i++) {
            total = total + a[i];
            a[i] = -a[i];
        }

        int minSum = kadane(a);
        int circularMax = total + minSum;

        if (normalMax < 0) {
            System.out.println(normalMax);
        } else {
            System.out.println(Math.max(normalMax, circularMax));
        }
    }
}