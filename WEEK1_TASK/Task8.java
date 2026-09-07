import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the position of the Fibonacci series: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0;

        if (n <= 0) {
            System.out.println("Invalid input: n must be a positive integer");
        } else if (n == 1) {
            System.out.println("Fibonacci number = " + a);
        } else if (n == 2) {
            System.out.println("Fibonacci number = " + b);
        } else {
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Fibonacci number = " + c);
        }

        sc.close();
    }
}