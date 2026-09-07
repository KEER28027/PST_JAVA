import java.util.Scanner;

class TASK7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            String current = "";

            for (int j = i; j < s.length(); j++) {

                if (current.indexOf(s.charAt(j)) != -1) {
                    break;
                }

                current = current + s.charAt(j);

                if (current.length() > max) {
                    max = current.length();
                }
            }
        }

        System.out.println(max);
    }
}