import java.util.Scanner;

class TASK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int maxSum = a[0];

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum = sum + a[j];

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}