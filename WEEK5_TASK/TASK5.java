import java.util.Scanner;

class TASK5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int i = 0;
        int sign = 1;
        int number = 0;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < s.length() && s.charAt(i) == '+') {
            i++;
        }

        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            number = number * 10 + (s.charAt(i) - '0');
            i++;
        }

        System.out.println(number * sign);
    }
}