public class SYLLABUS_TASK9_CalculatorUnitTesting {
    static class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        int divide(int a, int b) {
            return a / b;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        boolean additionTest = calculator.add(10, 20) == 30;
        boolean divisionTest = calculator.divide(20, 4) == 5;

        if (additionTest && divisionTest) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
