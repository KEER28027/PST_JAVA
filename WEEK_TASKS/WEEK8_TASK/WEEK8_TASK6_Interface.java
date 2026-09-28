import java.util.*;

public class WEEK8_TASK6_Interface {
    interface AdvancedArithmetic { int divisor_sum(int n); }
    static class MyCalculator implements AdvancedArithmetic {
        public int divisor_sum(int n) {
            int sum=0;
            for(int i=1;i<=n/i;i++) if(n%i==0) { sum+=i; if(i!=n/i) sum+=n/i; }
            return sum;
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        MyCalculator calculator=new MyCalculator();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(calculator.divisor_sum(n));
        in.close();
    }
}
