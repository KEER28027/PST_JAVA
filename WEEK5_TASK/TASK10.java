import java.util.Scanner;

class TASK10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pattern = sc.nextLine();

        for (int i = 0; i <= text.length() - pattern.length(); i++) {

            int j;

            for (j = 0; j < pattern.length(); j++) {

                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            if (j == pattern.length()) {
                System.out.print(i + " ");
            }
        }
    }
}