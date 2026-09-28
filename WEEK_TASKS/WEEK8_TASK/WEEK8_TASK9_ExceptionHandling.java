import java.util.*;

public class WEEK8_TASK9_ExceptionHandling {
    static class MyCalculator {
        long power(int n,int p) throws Exception {
            if(n<0||p<0) throw new Exception("n or p should not be negative.");
            if(n==0&&p==0) throw new Exception("n and p should not be zero.");
            return (long)Math.pow(n,p);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);MyCalculator calc=new MyCalculator();
        while(in.hasNextInt()){
            int n=in.nextInt(); if(!in.hasNextInt())break; int p=in.nextInt();
            try{System.out.println(calc.power(n,p));}catch(Exception e){System.out.println("java.lang.Exception: "+e.getMessage());}
        }
        in.close();
    }
}
