import java.util.Scanner;
class Arithmetic {
    int add(int a, int b) { return a + b; }
}
class Adder extends Arithmetic {}
public class WEEK7_TASK8_JavaInheritance2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Adder adder = new Adder();
        System.out.print("Enter two whole numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Adder inherits from Arithmetic.");
        System.out.println("Sum: " + adder.add(a, b));
    }
}