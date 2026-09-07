import java.util.Scanner;

class TASK3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int maxSub = a[0];
            int current = a[0];

            for (int i = 1; i < n; i++) {
                current = Math.max(a[i], current + a[i]);
                maxSub = Math.max(maxSub, current);
            }

            int maxSeq = 0;
            int largest = a[0];

            for (int i = 0; i < n; i++) {
                if (a[i] > 0) {
                    maxSeq = maxSeq + a[i];
                }

                if (a[i] > largest) {
                    largest = a[i];
                }
            }

            if (maxSeq == 0) {
                maxSeq = largest;
            }

            System.out.println(maxSub + " " + maxSeq);
        }
    }
}