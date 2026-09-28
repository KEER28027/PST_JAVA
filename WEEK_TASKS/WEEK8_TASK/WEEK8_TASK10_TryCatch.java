import java.util.*;

public class WEEK8_TASK10_TryCatch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        try {
            int a=in.nextInt(); int b=in.nextInt();
            System.out.println(a/b);
        } catch(InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch(ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        in.close();
    }
}
