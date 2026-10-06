import java.util.Scanner;

public class SYLLABUS_TASK10_SecureAuthenticationStressTesting {
    static boolean isValid(String username, String password) {
        boolean usernameValid = username.length() >= 3 && username.length() <= 20;
        boolean passwordValid = password.length() >= 6 && password.length() <= 20;
        return usernameValid && passwordValid;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            String username = input.next();
            String password = input.next();
            System.out.println(isValid(username, password) ? "SUCCESS" : "FAILURE");
        }
    }
}
